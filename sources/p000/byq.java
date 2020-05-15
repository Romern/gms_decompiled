package p000;

import java.io.ByteArrayOutputStream;
import java.util.List;

/* renamed from: byq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byq extends bwz {

    /* renamed from: a */
    public static final byte[] f6209a = {119};

    /* renamed from: b */
    public static final bzx f6210b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6211c;

    /* renamed from: d */
    public static final int f6212d = 7;

    /* renamed from: e */
    public static final int f6213e = 1;

    /* renamed from: f */
    public static final int f6214f = 2;

    /* renamed from: g */
    public static final int f6215g = 6;

    /* renamed from: h */
    public static final int f6216h = 2;

    /* renamed from: i */
    public static final int f6217i = 5;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Response Message Template Format 2";
        bzv.f6287b = "Contains the data objects (with tags and lengths) returned by the card in response to a command.";
        bzv.f6293h = f6212d;
        bzv.f6294i = f6213e;
        bzv.f6290e = f6210b;
        bzv.f6297l = f6216h;
        bzv.f6288c = f6209a;
        bzv.f6295j = f6214f;
        bzv.f6296k = f6215g;
        bzv.f6298m = f6217i;
        f6211c = bzv.mo3629a();
    }

    public byq(List list) {
        this((bwz[]) list.toArray(new bwz[list.size()]));
    }

    public final String toString() {
        return bpp.m3462a(this.f5930l);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public byq(bwz... bwzArr) {
        super(r0.toByteArray(), f6211c);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (bwz bwz : bwzArr) {
                bwz.mo3564j().mo3352a(byteArrayOutputStream);
            }
        } catch (bpd e) {
            throw new RuntimeException(e);
        }
    }
}
