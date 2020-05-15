package p000;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: ciid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciid implements chtt {

    /* renamed from: a */
    private static final ThreadLocal f190398a = new ThreadLocal();

    /* renamed from: b */
    private final bxxk f190399b;

    /* renamed from: c */
    private final bxxc f190400c;

    public ciid(bxxc bxxc) {
        this.f190400c = bxxc;
        this.f190399b = bxxc.mo74143cZ();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InputStream mo12898a(Object obj) {
        return new ciic((bxxc) obj, this.f190399b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0051 A[Catch:{ IOException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[Catch:{ IOException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063 A[Catch:{ IOException -> 0x00bd }] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12899a(InputStream inputStream) {
        byte[] bArr;
        int i;
        if (inputStream instanceof ciic) {
            ciic ciic = (ciic) inputStream;
            if (ciic.f190396b == this.f190399b) {
                try {
                    bxxc bxxc = ciic.f190395a;
                    if (bxxc != null) {
                        return bxxc;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException e) {
                }
            }
        }
        try {
            bxuc bxuc = null;
            if (inputStream instanceof chsj) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    Reference reference = (Reference) f190398a.get();
                    if (!(reference == null || (bArr = (byte[]) reference.get()) == null)) {
                        if (bArr.length < available) {
                        }
                        i = available;
                        while (i > 0) {
                            int read = inputStream.read(bArr, available - i, i);
                            if (read == -1) {
                                break;
                            }
                            i -= read;
                        }
                        if (i != 0) {
                            bxuc = bxuc.m123420a(bArr, available);
                        } else {
                            int i2 = available - i;
                            StringBuilder sb = new StringBuilder(43);
                            sb.append("size inaccurate: ");
                            sb.append(available);
                            sb.append(" != ");
                            sb.append(i2);
                            throw new RuntimeException(sb.toString());
                        }
                    }
                    bArr = new byte[available];
                    f190398a.set(new WeakReference(bArr));
                    i = available;
                    while (i > 0) {
                    }
                    if (i != 0) {
                    }
                } else if (available == 0) {
                    return this.f190400c;
                }
            }
            if (bxuc == null) {
                bxuc = bxuc.m123416a(inputStream);
            }
            bxuc.f164827c = Integer.MAX_VALUE;
            try {
                bxxc bxxc2 = (bxxc) this.f190399b.mo73655a(bxuc, ciie.f190401a);
                bxuc.mo73787a(0);
                return bxxc2;
            } catch (bxwf e2) {
                throw e2;
            } catch (bxwf e3) {
                throw chuv.f189228o.mo85687a("Invalid protobuf byte sequence").mo85692c(e3).mo85691b();
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
