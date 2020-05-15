package p000;

import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;

/* renamed from: plh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class plh extends SelectableChannel implements ReadableByteChannel {

    /* renamed from: a */
    protected final SocketChannel f39587a;

    public plh(SocketChannel socketChannel) {
        this.f39587a = socketChannel;
    }

    /* renamed from: a */
    public final int mo23360a(ByteBuffer byteBuffer) {
        return this.f39587a.write(byteBuffer);
    }

    public final Object blockingLock() {
        return this.f39587a.blockingLock();
    }

    public final SelectableChannel configureBlocking(boolean z) {
        return this.f39587a.configureBlocking(z);
    }

    public final void implCloseChannel() {
        this.f39587a.close();
    }

    public final boolean isBlocking() {
        return this.f39587a.isBlocking();
    }

    public final boolean isRegistered() {
        return this.f39587a.isRegistered();
    }

    public final SelectionKey keyFor(Selector selector) {
        return this.f39587a.keyFor(selector);
    }

    public final SelectorProvider provider() {
        return this.f39587a.provider();
    }

    public final int read(ByteBuffer byteBuffer) {
        return this.f39587a.read(byteBuffer);
    }

    public final SelectionKey register(Selector selector, int i, Object obj) {
        return this.f39587a.register(selector, i, obj);
    }

    public final int validOps() {
        return this.f39587a.validOps();
    }

    /* renamed from: a */
    public final Socket mo23361a() {
        return this.f39587a.socket();
    }
}
