package p000;

import java.net.ServerSocket;
import java.util.concurrent.Callable;

/* renamed from: aiuj */
final /* synthetic */ class aiuj implements Callable {

    /* renamed from: a */
    static final Callable f69788a = new aiuj();

    private aiuj() {
    }

    public final Object call() {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(null);
        return serverSocket;
    }
}
