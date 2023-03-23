package com.jenkov.nioserver;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;


public class Server {

    @Server
    public void test() throws IOException {
        Selector selector = Selector.open();

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.bind(new InetSocketAddress("rmcloudata", 1986));

        socketChannel.configureBlocking(false);

        SelectionKey key1 = socketChannel.register(server, SelectionKey.OP_WRITE);
        key1.cancel();

        SelectionKey key2 = socketChannel.register(server, SelectionKey.OP_WRITE);
        key2.cancel();
    }
}
