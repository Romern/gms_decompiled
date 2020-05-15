package p000;

import android.net.Uri;
import java.net.URI;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: qrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qrm extends qrj {

    /* renamed from: e */
    private static final quj f41999e;

    public qrm() {
        super(true, 2, (bxxk) qun.f42164n.mo74142c(7), (bxxk) bsua.f147094f.mo74142c(7));
    }

    /* renamed from: a */
    protected static final String m32722a(qun qun) {
        return qro.m32739a(f41999e, qun.f42168c, qun.f42169d, qun.f42170e, qun.f42171f, qun.f42167b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo24221b(bxxc bxxc, bmxv bmxv) {
        bsua bsua = (bsua) bxxc;
        try {
            qqy qqy = (qqy) bmxv.mo66814b();
            qui qui = bsua.f147099d;
            if (qui == null) {
                qui = qui.f42142d;
            }
            return (qun) bxvk.m124016a(qun.f42164n, qqy.mo24213a(qui), bxus.m123744c());
        } catch (bxwf e) {
            throw new qrp(769, "Invalid proto bytes.", e);
        } catch (qqx e2) {
            throw new qrp(qrq.m32743a(e2), "Unable to decrypt the data.", e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo24223c(bxxc bxxc) {
        qun qun = (qun) bxxc;
        bxvd bxvd = (bxvd) qun.mo74142c(5);
        bxvd.mo73625a((bxvk) qun);
        Uri parse = Uri.parse(((qun) bxvd.f164949b).f42168c);
        String a = qqt.m32667a(((qun) bxvd.f164949b).f42168c);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qun qun2 = (qun) bxvd.f164949b;
        qun qun3 = qun.f42164n;
        a.getClass();
        qun2.f42166a |= 4;
        qun2.f42168c = a;
        String uri = parse.buildUpon().path("/").clearQuery().fragment("").build().toString();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qun qun4 = (qun) bxvd.f164949b;
        uri.getClass();
        qun4.f42166a |= 2;
        qun4.f42167b = uri;
        return (qun) bxvd.mo74062i();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bnic mo24224d(bxxc bxxc) {
        qun qun = (qun) bxxc;
        HashSet hashSet = new HashSet();
        hashSet.add(m32722a(qun));
        if (qqt.m32668b(qun.f42168c)) {
            URI create = URI.create(qun.f42168c);
            bxvd bxvd = (bxvd) qun.mo74142c(5);
            bxvd.mo73625a((bxvk) qun);
            String scheme = create.getScheme();
            String authority = create.getAuthority();
            StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(authority).length());
            sb.append(scheme);
            sb.append("://");
            sb.append(authority);
            String sb2 = sb.toString();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qun qun2 = (qun) bxvd.f164949b;
            qun qun3 = qun.f42164n;
            sb2.getClass();
            qun2.f42166a |= 4;
            qun2.f42168c = sb2;
            String scheme2 = create.getScheme();
            String authority2 = create.getAuthority();
            StringBuilder sb3 = new StringBuilder(String.valueOf(scheme2).length() + 3 + String.valueOf(authority2).length());
            sb3.append(scheme2);
            sb3.append("://");
            sb3.append(authority2);
            String sb4 = sb3.toString();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qun qun4 = (qun) bxvd.f164949b;
            sb4.getClass();
            qun4.f42166a |= 2;
            qun4.f42167b = sb4;
            hashSet.add(m32722a((qun) bxvd.mo74062i()));
            bxvd bxvd2 = (bxvd) qun.mo74142c(5);
            bxvd2.mo73625a((bxvk) qun);
            String scheme3 = create.getScheme();
            String authority3 = create.getAuthority();
            StringBuilder sb5 = new StringBuilder(String.valueOf(scheme3).length() + 4 + String.valueOf(authority3).length());
            sb5.append(scheme3);
            sb5.append("://");
            sb5.append(authority3);
            sb5.append("/");
            String sb6 = sb5.toString();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            qun qun5 = (qun) bxvd2.f164949b;
            sb6.getClass();
            qun5.f42166a |= 4;
            qun5.f42168c = sb6;
            String scheme4 = create.getScheme();
            String authority4 = create.getAuthority();
            StringBuilder sb7 = new StringBuilder(String.valueOf(scheme4).length() + 3 + String.valueOf(authority4).length());
            sb7.append(scheme4);
            sb7.append("://");
            sb7.append(authority4);
            String sb8 = sb7.toString();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            qun qun6 = (qun) bxvd2.f164949b;
            sb8.getClass();
            qun6.f42166a |= 2;
            qun6.f42167b = sb8;
            hashSet.add(m32722a((qun) bxvd2.mo74062i()));
            bxvd bxvd3 = (bxvd) qun.mo74142c(5);
            bxvd3.mo73625a((bxvk) qun);
            String scheme5 = create.getScheme();
            String authority5 = create.getAuthority();
            StringBuilder sb9 = new StringBuilder(String.valueOf(scheme5).length() + 3 + String.valueOf(authority5).length());
            sb9.append(scheme5);
            sb9.append("://");
            sb9.append(authority5);
            String sb10 = sb9.toString();
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            qun qun7 = (qun) bxvd3.f164949b;
            sb10.getClass();
            qun7.f42166a |= 4;
            qun7.f42168c = sb10;
            String scheme6 = create.getScheme();
            String authority6 = create.getAuthority();
            StringBuilder sb11 = new StringBuilder(String.valueOf(scheme6).length() + 4 + String.valueOf(authority6).length());
            sb11.append(scheme6);
            sb11.append("://");
            sb11.append(authority6);
            sb11.append("/");
            String sb12 = sb11.toString();
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            qun qun8 = (qun) bxvd3.f164949b;
            sb12.getClass();
            qun8.f42166a |= 2;
            qun8.f42167b = sb12;
            hashSet.add(m32722a((qun) bxvd3.mo74062i()));
        }
        return bnic.m109495a((Collection) hashSet);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo24225e(bxxc bxxc) {
        qun qun = (qun) bxxc;
        if (!qun.f42175j || qun.f42170e.isEmpty()) {
            m32723a("origin", qun.f42168c);
            m32723a("signon_realm", qun.f42167b);
            return;
        }
        throw new qrl("username_value", "should be empty if the password is blacklisted");
    }

    static {
        bxvd da = quj.f42147e.mo74144da();
        qum qum = qum.f42162a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quj quj = (quj) da.f164949b;
        qum.getClass();
        quj.f42150b = qum;
        quj.f42149a |= 2;
        f41999e = (quj) da.mo74062i();
    }

    /* renamed from: a */
    private static void m32723a(String str, String str2) {
        if (!bmxx.m108577a(str2)) {
            try {
                URI create = URI.create(str2);
                if (qqt.m32668b(str2)) {
                    String authority = create.getAuthority();
                    if (authority == null || !authority.matches(".+@.+")) {
                        throw new qrl(str, String.format(Locale.US, "invalid Android URI \"%s\"", str2));
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new qrl(str, String.format(Locale.US, "invalid URI \"%s\"", str2));
            }
        } else {
            throw new qrl(str, "cannot be empty");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo24219a(bxxc bxxc, bmxv bmxv) {
        qun qun = (qun) bxxc;
        bxvd da = bsua.f147094f.mo74144da();
        bxvd da2 = bsub.f147101b.mo74144da();
        String str = qun.f42167b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str.getClass();
        ((bsub) da2.f164949b).f147103a = str;
        bsub bsub = (bsub) da2.mo74062i();
        String a = m32722a(qun);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsua bsua = (bsua) da.f164949b;
        a.getClass();
        bsua.f147097b = a;
        bsub.getClass();
        bsua.f147100e = bsub;
        try {
            qui a2 = ((qqy) bmxv.mo66814b()).mo24212a(qun.mo73642k());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((bsua) da.f164949b).f147099d = a2;
            return (bsua) da.mo74062i();
        } catch (qqx e) {
            throw new qrp(qrq.m32743a(e), "Unable to encrypt the data.", e);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ qrf mo24222b(bxxc bxxc) {
        qun qun = (qun) bxxc;
        return new qrg(m32722a(qun), qun);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo24220a(bxxc bxxc) {
        return m32722a((qun) bxxc);
    }
}
