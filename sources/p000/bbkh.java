package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bbkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbkh implements bbkl {

    /* renamed from: a */
    public final Account f102809a;

    /* renamed from: b */
    public final bavw f102810b;

    /* renamed from: c */
    private final Context f102811c;

    /* renamed from: d */
    private final bxqw f102812d = new bxqw();

    public bbkh(Account account, Context context, bavw bavw) {
        this.f102809a = account;
        this.f102811c = context;
        this.f102810b = bavw;
    }

    /* renamed from: a */
    private final String m88123a(Uri uri, int i) {
        ayuk ayuk = new ayuk(uri);
        bmxy.m108588a(true);
        String ayuk2 = ayuk.toString();
        if (ayuk2 == null) {
            throw new IllegalArgumentException();
        } else if (bxrd.f164545a.matcher(ayuk2).find()) {
            bxqw bxqw = this.f102812d;
            int a = mo56176a(i);
            bxra bxra = new bxra();
            bxra.f164539a.mo73612a(bxqy.SIZE, Integer.valueOf(a));
            bxra.f164539a.mo73611a(bxqy.SIZE);
            return bxqw.mo73609a(bxra, uri).toString();
        } else {
            String valueOf = String.valueOf(uri);
            int a2 = mo56176a(i);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append(valueOf);
            sb.append("?sz=");
            sb.append(a2);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static String m88124a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("photos_filegroup_") : "photos_filegroup_".concat(valueOf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo56176a(int i) {
        if (i == 0) {
            return this.f102811c.getResources().getDimensionPixelSize(C0126R.dimen.tiny_photo_size);
        }
        if (i == 1) {
            return this.f102811c.getResources().getDimensionPixelSize(C0126R.dimen.small_photo_size);
        }
        if (i == 2) {
            return this.f102811c.getResources().getDimensionPixelSize(C0126R.dimen.medium_photo_size);
        }
        if (i != 3) {
            return this.f102811c.getResources().getDimensionPixelSize(C0126R.dimen.thumbnail_photo_size);
        }
        return this.f102811c.getResources().getDimensionPixelSize(C0126R.dimen.large_photo_size);
    }

    /* renamed from: a */
    public final bqgg mo56177a(String str, String str2) {
        String str3 = "";
        Uri parse = Uri.parse(str);
        try {
            bauh bauh = (bauh) baui.f101771e.mo74144da();
            String a = m88124a(str2);
            if (bauh.f164950c) {
                bauh.mo74035c();
                bauh.f164950c = false;
            }
            baui baui = (baui) bauh.f164949b;
            a.getClass();
            baui.f101773a |= 1;
            baui.f101774b = a;
            bxvd da = baug.f101763f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            baug baug = (baug) da.f164949b;
            "tiny-photo-id".getClass();
            baug.f101765a |= 1;
            baug.f101766b = "tiny-photo-id";
            String a2 = m88123a(parse, 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            baug baug2 = (baug) da.f164949b;
            a2.getClass();
            baug2.f101765a |= 2;
            baug2.f101767c = a2;
            baug.m87563a(baug2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            baug baug3 = (baug) da.f164949b;
            baug3.f101768d = 1;
            int i = baug3.f101765a | 8;
            baug3.f101765a = i;
            str3.getClass();
            baug3.f101765a = i | 16;
            baug3.f101769e = str3;
            bauh.mo55986a(da);
            bxvd da2 = baug.f101763f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            baug baug4 = (baug) da2.f164949b;
            "small-photo-id".getClass();
            baug4.f101765a |= 1;
            baug4.f101766b = "small-photo-id";
            String a3 = m88123a(parse, 1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            baug baug5 = (baug) da2.f164949b;
            a3.getClass();
            baug5.f101765a |= 2;
            baug5.f101767c = a3;
            baug.m87563a(baug5);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            baug baug6 = (baug) da2.f164949b;
            baug6.f101768d = 1;
            int i2 = baug6.f101765a | 8;
            baug6.f101765a = i2;
            str3.getClass();
            baug6.f101765a = i2 | 16;
            baug6.f101769e = str3;
            bauh.mo55986a(da2);
            bxvd da3 = baug.f101763f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            baug baug7 = (baug) da3.f164949b;
            "medium-photo-id".getClass();
            baug7.f101765a |= 1;
            baug7.f101766b = "medium-photo-id";
            String a4 = m88123a(parse, 2);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            baug baug8 = (baug) da3.f164949b;
            a4.getClass();
            baug8.f101765a |= 2;
            baug8.f101767c = a4;
            baug.m87563a(baug8);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            baug baug9 = (baug) da3.f164949b;
            baug9.f101768d = 1;
            int i3 = baug9.f101765a | 8;
            baug9.f101765a = i3;
            str3.getClass();
            baug9.f101765a = i3 | 16;
            baug9.f101769e = str3;
            bauh.mo55986a(da3);
            bxvd da4 = baug.f101763f.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            baug baug10 = (baug) da4.f164949b;
            "large-photo-id".getClass();
            baug10.f101765a |= 1;
            baug10.f101766b = "large-photo-id";
            String a5 = m88123a(parse, 3);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            baug baug11 = (baug) da4.f164949b;
            a5.getClass();
            baug11.f101765a |= 2;
            baug11.f101767c = a5;
            baug.m87563a(baug11);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            baug baug12 = (baug) da4.f164949b;
            baug12.f101768d = 1;
            int i4 = baug12.f101765a | 8;
            baug12.f101765a = i4;
            str3.getClass();
            baug12.f101765a = i4 | 16;
            baug12.f101769e = str3;
            bauh.mo55986a(da4);
            bxvd da5 = baug.f101763f.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            baug baug13 = (baug) da5.f164949b;
            "thumbnail-photo-id".getClass();
            baug13.f101765a |= 1;
            baug13.f101766b = "thumbnail-photo-id";
            String a6 = m88123a(parse, 4);
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            baug baug14 = (baug) da5.f164949b;
            a6.getClass();
            baug14.f101765a |= 2;
            baug14.f101767c = a6;
            baug.m87563a(baug14);
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            baug baug15 = (baug) da5.f164949b;
            baug15.f101768d = 1;
            int i5 = baug15.f101765a | 8;
            baug15.f101765a = i5;
            str3.getClass();
            baug15.f101765a = i5 | 16;
            baug15.f101769e = str3;
            bauh.mo55986a(da5);
            baui baui2 = (baui) bauh.mo74062i();
            bavw bavw = this.f102810b;
            baty baty = new baty(null);
            baty.f101745b = bmxv.m108566b(this.f102809a);
            if (baui2 != null) {
                baty.f101744a = baui2;
                if (baty.f101744a == null) {
                    str3 = " dataFileGroup";
                }
                if (str3.isEmpty()) {
                    return bqdx.m112673a(bqdx.m112674a(bqfl.m112747c(bavw.mo55993a(new baub(baty.f101744a, baty.f101745b))), new bbkc(this, str2), bqfb.INSTANCE), bbkd.f102803a, bqfb.INSTANCE);
                }
                throw new IllegalStateException(str3.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str3));
            }
            throw new NullPointerException("Null dataFileGroup");
        } catch (ayul e) {
            return bqga.m112777a((Throwable) e);
        }
    }
}
