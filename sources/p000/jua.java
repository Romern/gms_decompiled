package p000;

/* renamed from: jua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jua {

    /* renamed from: a */
    public static final Logger f23219a = new Logger("D2D", "BluetoothConnectionSecurer");

    /* renamed from: b */
    public static final jtx f23220b = jtx.f23208a;

    /* renamed from: a */
    public static jtz m17343a(jup jup, jul jul, byte[] bArr, jus jus) {
        byrd b = byrd.m125181b();
        b.mo74486b(bArr);
        byte[] a = b.mo74485a(jus.serializeToBytes());
        byqy e = b.mo74489e();
        jup.f23241e = new jty(jul, e);
        jun jun = new jun(jup);
        jup.f23237a.mo25412b("Connection listener thread starting.", new Object[0]);
        jun.start();
        jup.mo14114a(a);
        return new jtz(jup, e);
    }
}
