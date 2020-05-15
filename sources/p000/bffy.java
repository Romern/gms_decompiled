package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: bffy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bffy implements bwdf {

    /* renamed from: a */
    public final bwcn f113728a;

    /* renamed from: b */
    public final Map f113729b;

    /* renamed from: c */
    public final Map f113730c;

    public bffy(Context context) {
        int i = bfib.f113998b;
        bwcl bwcl = new bwcl();
        String a = aymn.m84264a(context.getContentResolver(), "collectionlib:masf_address");
        bwcl.f158823a = TextUtils.isEmpty(a) ? "https://www.google.com/loc/m/api" : a;
        bwcl.f158824b = "location";
        bwcl.f158825c = "1.0";
        bwcl.f158826d = "android";
        bwcl.f158827e = "collectionlib";
        bwcn.m121757a(bwcl);
        this.f113728a = bwcn.m121756a();
        this.f113729b = bfib.m96843b();
        this.f113730c = bfib.m96843b();
    }

    /* renamed from: a */
    public static bfgp m96629a(bsax bsax, String str) {
        if (bsax != null) {
            return new bfgp(bsax, null);
        }
        return new bfgp(null, str);
    }

    /* renamed from: a */
    private final void m96630a(bwdg bwdg, bsax bsax, String str) {
        bffx bffx = (bffx) this.f113729b.remove(bwdg);
        if (bffx == null) {
            bfne bfne = (bfne) this.f113730c.remove(bwdg);
            if (bfne != null && bfne.f114468b != null) {
                bsax bsax2 = (bsax) bfne.f114467a;
                if (!ceze.f183524a.mo6606a().verifyGlocStatus()) {
                    ((bfef) bfne.f114468b).mo61530a(bsax2, m96629a(bsax, str));
                    return;
                }
                bmxy.m108581a(bsax2);
                ((bfef) bfne.f114468b).mo61530a(bsax2, m96629a(bsax, str));
                return;
            }
            return;
        }
        bffx.f113727b = bfne.m97311a(bsax, str);
        bffx.f113726a.countDown();
    }

    /* renamed from: a */
    public final bwdg mo61637a(String str, bsax bsax) {
        try {
            bwdc bwdc = new bwdc(str, bsax.mo70120b());
            bwdc.mo73504a(this);
            return bwdc;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public final void mo61638a(bwdg bwdg, bwdh bwdh) {
        String str;
        bsax bsax = null;
        try {
            int i = bwdh.f158896b;
            if (i != 200) {
                StringBuilder sb = new StringBuilder(28);
                sb.append("Server error, RC=");
                sb.append(i);
                str = sb.toString();
            } else {
                InputStream b = bwdh.mo73459b();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = b.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bsax bsax2 = new bsax(bgox.f117047an);
                bsax2.mo70111a(byteArray);
                if (!bsax2.mo70112a()) {
                    throw new IOException("isValid returned after parsing reply");
                } else if (bsax2.mo70114b(1) != 0) {
                    str = String.format("GLS error: %s", Integer.valueOf(bsax2.mo70114b(1)));
                } else {
                    str = null;
                    bsax = bsax2;
                }
            }
        } catch (IOException e) {
            str = String.format("Failed to read data from MASF: %s", e.getMessage());
        }
        m96630a(bwdg, bsax, str);
    }

    /* renamed from: a */
    public final void mo61639a(bwdg bwdg, Exception exc) {
        m96630a(bwdg, null, String.format("Failed to send data to MASF: %s", exc.getMessage()));
    }
}
