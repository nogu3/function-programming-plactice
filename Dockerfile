FROM openjdk:11-slim

RUN apt-get update
WORKDIR /usr/src

RUN apt-get install -y curl \ 
    neovim \
    git

# install scala
RUN curl -fL https://github.com/coursier/coursier/releases/latest/download/cs-x86_64-pc-linux.gz | gzip -d > cs \ 
    && chmod +x cs \
    && ./cs setup --yes

ENV PATH="${PATH}:~/.local/share/coursier/bin"
# TODO 効いてないので、なおす
RUN alias vi=neovim \
    && alias s=scala