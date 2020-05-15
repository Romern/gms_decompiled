package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataChannel {

    /* renamed from: a */
    private long f191796a;

    /* renamed from: b */
    private long f191797b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Buffer {

        /* renamed from: a */
        public final ByteBuffer f191798a;

        /* renamed from: b */
        public final boolean f191799b;

        public Buffer(ByteBuffer byteBuffer, boolean z) {
            this.f191798a = byteBuffer;
            this.f191799b = z;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Init {

        /* renamed from: a */
        public boolean f191800a = true;

        /* renamed from: b */
        public int f191801b = -1;

        /* renamed from: c */
        public int f191802c = -1;

        /* renamed from: d */
        public String f191803d = "";

        /* renamed from: e */
        public int f191804e = -1;

        /* access modifiers changed from: package-private */
        public int getId() {
            return this.f191804e;
        }

        /* access modifiers changed from: package-private */
        public int getMaxRetransmitTimeMs() {
            return this.f191801b;
        }

        /* access modifiers changed from: package-private */
        public int getMaxRetransmits() {
            return this.f191802c;
        }

        /* access modifiers changed from: package-private */
        public boolean getNegotiated() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean getOrdered() {
            return this.f191800a;
        }

        /* access modifiers changed from: package-private */
        public String getProtocol() {
            return this.f191803d;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Observer {
        void onBufferedAmountChange(long j);

        void onMessage(Buffer buffer);

        void onStateChange();
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public DataChannel(long j) {
        this.f191796a = j;
    }

    private native long nativeRegisterObserver(Observer observer);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j);

    /* renamed from: a */
    public final State mo86768a() {
        mo86770b();
        return nativeState();
    }

    /* renamed from: b */
    public final void mo86770b() {
        if (this.f191796a == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }

    /* access modifiers changed from: package-private */
    public long getNativeDataChannel() {
        return this.f191796a;
    }

    public native long nativeBufferedAmount();

    public native void nativeClose();

    public native boolean nativeSend(byte[] bArr, boolean z);

    /* renamed from: a */
    public final void mo86769a(Observer observer) {
        mo86770b();
        long j = this.f191797b;
        if (j != 0) {
            nativeUnregisterObserver(j);
        }
        this.f191797b = nativeRegisterObserver(observer);
    }
}
