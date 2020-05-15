package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Build;
import java.io.IOException;

/* renamed from: lr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1171lr {

    /* renamed from: a */
    public static final C1231nx f26626a = new C1231nx(16);

    static {
        int i = Build.VERSION.SDK_INT;
        new C1172ls(null);
    }

    /* renamed from: a */
    public static Typeface m19558a(Context context, Typeface typeface, int i) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* renamed from: a */
    public static Typeface m19559a(Context context, C1150ky kyVar, Resources resources, int i, int i2, C1161li liVar, boolean z) {
        Typeface typeface;
        int i3;
        boolean z2;
        int i4;
        int i5 = 0;
        if (kyVar instanceof C1154lb) {
            C1154lb lbVar = (C1154lb) kyVar;
            if (z) {
                if (lbVar.f25674c == 0) {
                    z2 = true;
                    if (z) {
                        i4 = lbVar.f25673b;
                    } else {
                        i4 = -1;
                    }
                    typeface = C1201mu.m19647a(context, lbVar.f25672a, liVar, z2, i4, i2);
                }
            } else if (liVar == null) {
                z2 = true;
                if (z) {
                }
                typeface = C1201mu.m19647a(context, lbVar.f25672a, liVar, z2, i4, i2);
            }
            z2 = false;
            if (z) {
            }
            typeface = C1201mu.m19647a(context, lbVar.f25672a, liVar, z2, i4, i2);
        } else {
            C1153la[] laVarArr = ((C1151kz) kyVar).f25439a;
            FontFamily.Builder builder = null;
            for (C1153la laVar : laVarArr) {
                try {
                    Font build = new Font.Builder(resources, laVar.f25516e).setWeight(laVar.f25512a).setSlant(laVar.f25513b ? 1 : 0).setTtcIndex(laVar.f25515d).setFontVariationSettings(laVar.f25514c).build();
                    if (builder != null) {
                        builder.addFont(build);
                    } else {
                        builder = new FontFamily.Builder(build);
                    }
                } catch (IOException e) {
                }
            }
            if (builder != null) {
                if ((i2 & 1) == 0) {
                    i3 = 400;
                } else {
                    i3 = 700;
                }
                if ((i2 & 2) != 0) {
                    i5 = 1;
                }
                typeface = new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i3, i5)).build();
            } else {
                typeface = null;
            }
            if (liVar != null) {
                if (typeface == null) {
                    liVar.mo15155b(-3);
                } else {
                    liVar.mo15156b(typeface);
                }
            }
        }
        if (typeface != null) {
            f26626a.mo15547a(m19560a(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static String m19560a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
