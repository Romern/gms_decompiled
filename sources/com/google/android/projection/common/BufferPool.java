package com.google.android.projection.common;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BufferPool {

    /* renamed from: a */
    public static BufferPool f151458a = new BufferPool();

    /* renamed from: b */
    private final List f151459b = new ArrayList(10);

    /* renamed from: c */
    private final List f151460c = new ArrayList(20);

    /* renamed from: d */
    private final List f151461d = new ArrayList(120);

    private BufferPool() {
        for (int i = 0; i < 5; i++) {
            this.f151459b.add(ByteBuffer.allocateDirect(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE));
        }
        for (int i2 = 0; i2 < 10; i2++) {
            this.f151460c.add(ByteBuffer.allocateDirect(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES));
        }
        for (int i3 = 0; i3 < 60; i3++) {
            this.f151461d.add(ByteBuffer.allocateDirect(512));
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m117794a(ByteBuffer byteBuffer) {
        f151458a.mo71340b(byteBuffer);
    }

    /* renamed from: b */
    private final List m117795b(int i) {
        return i > 512 ? i > 16384 ? this.f151459b : this.f151460c : this.f151461d;
    }

    @Deprecated
    public static ByteBuffer getBuffer(int i) {
        return f151458a.mo71339a(i);
    }

    /* renamed from: b */
    public final void mo71340b(ByteBuffer byteBuffer) {
        int i;
        int capacity = byteBuffer.capacity();
        byteBuffer.rewind();
        List b = m117795b(capacity);
        if (capacity > 512) {
            i = capacity <= 16384 ? 20 : 10;
        } else {
            i = 120;
        }
        synchronized (b) {
            if (b.size() >= i) {
                b.set(Math.abs(System.identityHashCode(byteBuffer)) % i, byteBuffer);
            } else {
                b.add(byteBuffer);
            }
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo71339a(int i) {
        ByteBuffer byteBuffer;
        List b = m117795b(i);
        synchronized (b) {
            byteBuffer = null;
            if (!b.isEmpty()) {
                int size = b.size() - 1;
                ByteBuffer byteBuffer2 = (ByteBuffer) b.remove(size);
                if (byteBuffer2.capacity() < i) {
                    int i2 = size - 1;
                    while (true) {
                        if (i2 < 0) {
                            break;
                        } else if (((ByteBuffer) b.get(i2)).capacity() >= i) {
                            byteBuffer = (ByteBuffer) b.get(i2);
                            b.set(i2, byteBuffer2);
                            break;
                        } else {
                            i2--;
                        }
                    }
                    if (byteBuffer == null) {
                        b.add(byteBuffer2);
                    }
                } else {
                    byteBuffer = byteBuffer2;
                }
            }
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocateDirect(i);
            }
        }
        byteBuffer.limit(i);
        return byteBuffer;
    }
}
