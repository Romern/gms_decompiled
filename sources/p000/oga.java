package p000;

import android.os.Handler;
import com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel;
import com.google.android.projection.common.BufferPool;
import java.nio.ByteBuffer;

/* renamed from: oga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oga implements ogw {

    /* renamed from: a */
    public static final bnsn f37530a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    public final int f37531b;

    /* renamed from: c */
    public final ofu f37532c;

    /* renamed from: d */
    public final oft f37533d;

    /* renamed from: e */
    public final int f37534e;

    /* renamed from: f */
    public final olk f37535f;

    /* renamed from: g */
    public final ogs f37536g;

    /* renamed from: h */
    public int f37537h;

    /* renamed from: i */
    public boolean f37538i;

    /* renamed from: j */
    public final ofx f37539j;

    /* renamed from: k */
    public final Object f37540k = new Object();

    /* renamed from: l */
    public final Handler f37541l;

    public oga(int i, int i2, olk olk, ogs ogs, ofu ofu, oft oft, Handler handler) {
        this.f37531b = i;
        this.f37534e = i2;
        this.f37535f = olk;
        this.f37533d = oft;
        this.f37536g = ogs;
        this.f37532c = ofu;
        this.f37539j = new ofx(this);
        this.f37537h = 4;
        this.f37541l = handler;
    }

    /* renamed from: a */
    public final int mo22112a() {
        return this.f37531b;
    }

    /* renamed from: b */
    public final void mo22114b() {
        synchronized (this.f37540k) {
            if (this.f37537h == 0) {
                this.f37537h = 1;
                ogs ogs = this.f37536g;
                int i = this.f37531b;
                int i2 = this.f37534e;
                bxvd da = bipp.f121194d.mo74144da();
                int a = okb.m28990a(Integer.valueOf(i2));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bipp bipp = (bipp) da.f164949b;
                bipp.f121196a |= 1;
                bipp.f121197b = a;
                int a2 = okb.m28990a(Integer.valueOf(i));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bipp bipp2 = (bipp) da.f164949b;
                bipp2.f121196a |= 2;
                bipp2.f121198c = a2;
                bipp bipp3 = (bipp) da.mo74062i();
                int i3 = bipp3.f164961ai;
                if (i3 == -1) {
                    i3 = bxxm.f165037a.mo74228a(bipp3).mo74223b(bipp3);
                    bipp3.f164961ai = i3;
                }
                ByteBuffer buffer = BufferPool.getBuffer(i3 + 2);
                buffer.putShort(7);
                buffer.put(bipp3.mo73642k());
                ogs.mo22128a(i, buffer, false, true, new ogv(true, false, 0));
            }
        }
    }

    /* renamed from: c */
    public final void mo22115c() {
        int i;
        synchronized (this.f37540k) {
            i = this.f37537h;
            this.f37537h = 4;
        }
        if (i == 2) {
            this.f37533d.mo22084a(1);
        }
    }

    /* renamed from: a */
    public final void mo22113a(ByteBuffer byteBuffer, ogv ogv) {
        synchronized (this.f37540k) {
            if (this.f37537h == 2) {
                ogs ogs = this.f37536g;
                int i = this.f37531b;
                if (!ogs.f37582f) {
                    ogs.mo22128a(i, byteBuffer, true, false, ogv);
                }
            } else {
                throw new IllegalStateException("Channel must be open before sending a message.");
            }
        }
    }

    protected oga(Channel$FlattenedChannel channel$FlattenedChannel, ogs ogs, ofu ofu, oft oft, Handler handler) {
        this.f37531b = channel$FlattenedChannel.mo17384a();
        this.f37534e = channel$FlattenedChannel.mo17385b();
        this.f37537h = channel$FlattenedChannel.mo17386c();
        this.f37535f = channel$FlattenedChannel.mo17387d();
        this.f37536g = ogs;
        this.f37532c = ofu;
        this.f37533d = oft;
        this.f37541l = handler;
        this.f37539j = new ofx(this);
    }
}
