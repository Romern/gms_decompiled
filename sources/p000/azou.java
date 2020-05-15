package p000;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: azou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azou {
    /* renamed from: a */
    public static cbmd m85975a(String str) {
        bxvd da = cbmd.f177603c.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbmd) da.f164949b).f177605a = str;
            if (str.startsWith("+")) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cbmd) da.f164949b).f177606b = ciph.m150692a(3);
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cbmd) da.f164949b).f177606b = ciph.m150692a(4);
            }
        }
        return (cbmd) da.mo74062i();
    }

    /* renamed from: a */
    public static ciox m85976a(ciow ciow) {
        bxvd da = ciox.f191160b.mo74144da();
        if (ciow != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((ciox) da.f164949b).f191162a = ciow.mo3214a();
        }
        return (ciox) da.mo74062i();
    }

    /* renamed from: a */
    public static cioy m85977a(cioz cioz, String str) {
        bxvd da = cioy.f191163c.mo74144da();
        if (cioz != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cioz.getClass();
            ((cioy) da.f164949b).f191165a = cioz;
        }
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cioy) da.f164949b).f191166b = str;
        }
        return (cioy) da.mo74062i();
    }

    /* renamed from: a */
    public static cioz m85978a(int i, ArrayList arrayList) {
        bxvd da = cioz.f191167c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cioz) da.f164949b).f191169a = i - 2;
        if (arrayList != null) {
            cioz cioz = (cioz) da.f164949b;
            if (!cioz.f191170b.mo73666a()) {
                cioz.f191170b = bxvk.m124021a(cioz.f191170b);
            }
            bxsy.m123078a(arrayList, cioz.f191170b);
        }
        return (cioz) da.mo74062i();
    }

    /* renamed from: a */
    public static cipa m85979a(int i, String str) {
        bxvd da = cipa.f191171c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cipa) da.f164949b).f191173a = i - 2;
        str.getClass();
        ((cipa) da.f164949b).f191174b = str;
        return (cipa) da.mo74062i();
    }
}
