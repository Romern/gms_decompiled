package p000;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: mit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mit extends miu {

    /* renamed from: a */
    private static final lvn f33795a = new lvn("ProtobufLiteExpectation");

    /* renamed from: c */
    private final ByteArrayOutputStream f33796c = new ByteArrayOutputStream();

    protected mit(mhu mhu) {
        super(mhu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bxxc mo20039a(byte[] bArr);

    /* renamed from: a */
    public final OutputStream mo20025a() {
        return this.f33796c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20040a(bxxc bxxc);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mhu.a(int, java.lang.String, boolean):void
     arg types: [int, java.lang.String, int]
     candidates:
      mhu.a(int, int, java.lang.String):mpn
      mhu.a(int, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20027c() {
        try {
            mo20040a(mo20039a(this.f33796c.toByteArray()));
        } catch (bxwf e) {
            f33795a.mo25415d("Unable to parse protobuf lite.", e, new Object[0]);
            this.f33798b.mo20031a(3, e.getMessage(), true);
        }
    }
}
