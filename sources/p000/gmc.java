package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: gmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gmc implements gmd, gly, gmt {

    /* renamed from: a */
    private final String f18624a;

    public gmc(String str) {
        sdo.m34977c(str);
        this.f18624a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12048a(gmg gmg) {
        String str = (String) gmg.f18627r.get(this.f18624a);
        if (str != null) {
            return new ArrayList(Arrays.asList(TextUtils.split(str, ",")));
        }
        return null;
    }
}
