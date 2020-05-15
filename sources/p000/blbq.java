package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: blbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbq {

    /* renamed from: a */
    private final blbn f125852a;

    /* renamed from: b */
    private final InputStream f125853b;

    public blbq(InputStream inputStream, blbn blbn) {
        this.f125852a = blbn;
        this.f125853b = inputStream;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* renamed from: a */
    public final void mo66467a(OutputStream outputStream) {
        int i;
        boolean z;
        int i2;
        InputStream inputStream = this.f125853b;
        blbn blbn = this.f125852a;
        blbr blbr = new blbr(outputStream, 1048576);
        blbo a = blbf.m106974a(blbn.f125838b);
        byte[] bArr = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        while (true) {
            int read = inputStream.read(bArr);
            i = 0;
            if (read == -1) {
                break;
            }
            while (i < read) {
                a.mo66460a(bArr[i]);
                if (a.f125846e) {
                    blbr.mo66450a(a.f125845d);
                }
                if (a.mo66462b()) {
                    blbh blbh = null;
                    if (blbn.f125837a.f125827b.mo15643d(a.mo66464d()) >= 0) {
                        List list = (List) blbn.f125837a.f125827b.mo15646f(a.mo66464d());
                        if (list == null) {
                            list = new ArrayList();
                        }
                        Iterator it = list.iterator();
                        String str = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            blbh blbh2 = (blbh) it.next();
                            if (str == null) {
                                str = a.mo66465e();
                            }
                            if (blbh2.f125825b.equals(str)) {
                                blbh = blbh2;
                                break;
                            }
                        }
                    }
                    if (blbh != null) {
                        blbr.mo66451a(blbh.f125824a, blbn.f125838b);
                        a.mo66463c();
                    }
                }
                i++;
            }
        }
        int i3 = a.f125844c;
        int length = a.f125842a.length;
        if (i3 >= length) {
            i3 = length;
        }
        if (i3 != 0) {
            int i4 = blbn.f125839c;
            if (i4 != 0 && a.mo66459a(i4) == blbn.f125840d.intValue()) {
                if (blbn.f125841e.f125825b.equals(a.mo66461b(blbn.f125839c))) {
                    i3 -= blbn.f125839c;
                    z = true;
                    while (i < i3) {
                        int i5 = a.f125844c;
                        byte[] bArr2 = a.f125842a;
                        int length2 = bArr2.length;
                        if (i5 >= length2) {
                            i2 = (a.f125843b + i) % length2;
                        } else {
                            i2 = i;
                        }
                        blbr.mo66450a(bArr2[i2]);
                        i++;
                    }
                    if (z) {
                        blbr.mo66451a(blbn.f125841e.f125824a, blbn.f125839c);
                    }
                }
            }
            z = false;
            while (i < i3) {
            }
            if (z) {
            }
        }
        blbr.mo66449a();
    }
}
