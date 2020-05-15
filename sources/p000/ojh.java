package p000;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.projection.common.BufferPool;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ojh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ojh implements oft {

    /* renamed from: a */
    private static final bnsn f37750a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    private final ofs f37751b;

    /* renamed from: m */
    public volatile boolean f37752m;

    /* renamed from: n */
    public final int f37753n;

    /* renamed from: o */
    public final int f37754o;

    /* renamed from: p */
    public ogw f37755p;

    /* renamed from: q */
    protected final ojm f37756q;

    public ojh(int i, ofs ofs, ojm ojm) {
        this(i, ofs, ojm, 0);
    }

    /* renamed from: a */
    private final void m28905a(int i, boolean z, ByteBuffer byteBuffer) {
        if (!this.f37752m) {
            try {
                mo22209a(byteBuffer, z);
            } catch (IllegalStateException e) {
                bnsi b = f37750a.mo68387b();
                b.mo68432a("ojh", "a", 182, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68409a("Failed to send message type = %d because channel was closed", i);
            }
        }
    }

    /* renamed from: a */
    public void mo22084a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22085a(int i, ByteBuffer byteBuffer);

    /* renamed from: a */
    public void mo22210a(ogw ogw) {
        this.f37755p = ogw;
    }

    /* renamed from: d */
    public void mo22149d() {
        this.f37752m = true;
    }

    /* renamed from: i */
    public void mo22088i() {
        ofs ofs = this.f37751b;
        if (ofs != null) {
            ofs.mo20651a(this);
        }
    }

    /* renamed from: j */
    public olk mo22071j() {
        olk olk = olk.DEFAULT;
        if (!ccsw.f179874a.mo6606a().mo76746f()) {
            return olk;
        }
        int i = this.f37753n;
        if (i != 2) {
            return (i == 3 || i == 4 || i == 5) ? olk.AUDIO : olk;
        }
        return olk.VIDEO;
    }

    public ojh(int i, ofs ofs, ojm ojm, int i2) {
        this.f37752m = false;
        this.f37753n = i;
        this.f37751b = ofs;
        this.f37754o = i2;
        this.f37756q = ojm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ojh.a(int, bxxc, boolean):void
     arg types: [int, bxxc, int]
     candidates:
      ojh.a(int, boolean, java.nio.ByteBuffer):void
      ojh.a(int, bxxc, boolean):void */
    /* renamed from: a */
    public final void mo22206a(int i, bxxc bxxc) {
        mo22207a(i, bxxc, true);
    }

    /* renamed from: a */
    public final void mo22207a(int i, bxxc bxxc, boolean z) {
        ByteBuffer a = BufferPool.f151458a.mo71339a(bxxc.mo74145db() + 2);
        a.putShort((short) i);
        bxuk a2 = bxuk.m123636a(a);
        try {
            bxxc.mo73644a(a2);
            a2.mo73851c();
            m28905a(i, z, a);
        } catch (IOException e) {
            String name = bxxc.getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 55);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" threw an IOException (should never happen)");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22208a(int i, byte[] bArr, boolean z, int i2, int i3) {
        ByteBuffer a = BufferPool.f151458a.mo71339a(bArr.length + 2);
        a.putShort((short) i);
        a.put(bArr, i2, i3);
        m28905a(i, z, a);
    }

    /* renamed from: a */
    public void mo22146a(Bundle bundle) {
        throw new UnsupportedOperationException("Cannot suspend endpoint");
    }

    /* renamed from: a */
    public void mo22108a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 2) {
            bnsi d = f37750a.mo68390d();
            d.mo68432a("ojh", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Received message without type header.");
            return;
        }
        char c = (char) byteBuffer.getShort();
        try {
            mo22085a(c, byteBuffer);
        } catch (bxwf | bxym e) {
            String encodeToString = Base64.encodeToString(byteBuffer.array(), byteBuffer.arrayOffset() + 2, byteBuffer.limit() - 2, 0);
            if (encodeToString.length() > 100) {
                encodeToString = "<encoded message too long to log>";
            }
            bnsi b = f37750a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("ojh", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68425a("Received invalid protocol buffer. Message Type: %d, Service Type: %d, Message: %s", Integer.valueOf(c), Integer.valueOf(this.f37753n), encodeToString);
        }
        BufferPool.m117794a(byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22209a(ByteBuffer byteBuffer, boolean z) {
        this.f37755p.mo22113a(byteBuffer, new ogv(z, false, 0));
    }
}
