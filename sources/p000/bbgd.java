package p000;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: bbgd */
final /* synthetic */ class bbgd implements Callable {

    /* renamed from: a */
    private final bbgf f102581a;

    /* renamed from: b */
    private final Iterable f102582b;

    /* renamed from: c */
    private final bbfw f102583c;

    public bbgd(bbgf bbgf, Iterable iterable, bbfw bbfw) {
        this.f102581a = bbgf;
        this.f102582b = iterable;
        this.f102583c = bbfw;
    }

    public final Object call() {
        DataOutputStream dataOutputStream;
        FileOutputStream fileOutputStream;
        bbgf bbgf = this.f102581a;
        bnre i = bbhf.m88013a(this.f102582b, this.f102583c.mo56107a()).listIterator();
        while (i.hasNext()) {
            bbhf bbhf = (bbhf) i.next();
            bbfz bbfz = (bbfz) bbhf.mo56139b();
            been b = bbgf.mo56132a().mo60619b(bbgf.m87983a((ByteString) bbhf.mo56138a()));
            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(b.mo60610a(0)));
                dataOutputStream.writeLong(System.currentTimeMillis());
                int c = bbfz.mo56113c();
                String a = bbfy.m87974a(c);
                if (c != 0) {
                    dataOutputStream.writeUTF(a);
                    dataOutputStream.writeLong(bbfz.mo56112b());
                    dataOutputStream.close();
                    fileOutputStream = new FileOutputStream(b.mo60610a(1));
                    if (bbfz.mo56111a().mo66813a()) {
                        ((ByteString) bbfz.mo56111a().mo66814b()).mo73757a(fileOutputStream);
                    }
                    fileOutputStream.close();
                    b.f111429b.mo60618a(b, true);
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                b.mo60611a();
                throw th;
            }
        }
        return null;
        throw th;
        throw th;
    }
}
