package p000;

import com.google.android.projection.common.BufferPool;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ofw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ofw implements ofz {

    /* renamed from: a */
    final /* synthetic */ ofx f37527a;

    public ofw(ofx ofx) {
        this.f37527a = ofx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo22109a(ByteBuffer byteBuffer) {
        oga oga = this.f37527a.f37529b;
        bnsn bnsn = oga.f37530a;
        oga.f37537h = 3;
        oga.f37532c.mo22084a(0);
        oga oga2 = this.f37527a.f37529b;
        synchronized (oga2.f37540k) {
            int i = oga2.f37537h;
            if (i != 0) {
                if (i == 1) {
                    oga2.f37538i = true;
                } else if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new RuntimeException("Unhandled Channel State");
                        }
                    }
                }
                ogs ogs = oga2.f37536g;
                int i2 = oga2.f37531b;
                bipo bipo = bipo.f121192a;
                int i3 = bipo.f164961ai;
                if (i3 == -1) {
                    i3 = bxxm.f165037a.mo74228a(bipo).mo74223b(bipo);
                    bipo.f164961ai = i3;
                }
                ByteBuffer buffer = BufferPool.getBuffer(i3 + 2);
                buffer.putShort(9);
                try {
                    byte[] array = buffer.array();
                    int arrayOffset = buffer.arrayOffset() + 2;
                    int i4 = bipo.f164961ai;
                    if (i4 == -1) {
                        i4 = bxxm.f165037a.mo74228a(bipo).mo74223b(bipo);
                        bipo.f164961ai = i4;
                    }
                    bxuk c = bxuk.m123644c(array, arrayOffset, i4);
                    bipo.mo73644a(c);
                    c.mo73868d();
                    int i5 = bipo.f164961ai;
                    if (i5 == -1) {
                        i5 = bxxm.f165037a.mo74228a(bipo).mo74223b(bipo);
                        bipo.f164961ai = i5;
                    }
                    buffer.position(i5 + 2);
                    ogs.mo22128a(i2, buffer, false, true, new ogv(true, false, 0));
                    oga2.f37533d.mo22084a(0);
                    oga2.f37537h = 4;
                } catch (IOException e) {
                    String name = bipo.getClass().getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
                    sb.append("Serializing ");
                    sb.append(name);
                    sb.append(" to a byte array threw an IOException (should never happen).");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else {
                oga2.f37533d.mo22084a(0);
            }
        }
    }
}
