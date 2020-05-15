package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.plus.service.pos.PlusonesEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: anrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrz {

    /* renamed from: a */
    private static final Uri f77566a = sds.m34979a("default_avatar");

    /* renamed from: a */
    private static Uri m65088a(aocr aocr) {
        return (aocr == null || aocr.mo42528c() == null) ? f77566a : anuc.m65336a(aocr.mo42528c());
    }

    /* renamed from: a */
    public static anta m65089a(Context context, String str, boolean z, String str2, aocu aocu, String str3, String str4, String str5) {
        List list;
        int i;
        int i2;
        Uri uri;
        int i3;
        int i4;
        Uri uri2;
        Uri uri3;
        int i5;
        String str6;
        String str7;
        String str8;
        aocs b;
        List c;
        aocs b2;
        Uri uri4;
        boolean a = m65092a(aocu);
        aoct f = aocu.mo42535f();
        if (f == null) {
            list = Collections.emptyList();
        } else {
            aocs b3 = f.mo42531b();
            if (b3 == null) {
                list = Collections.emptyList();
            } else {
                list = b3.mo42530c();
                if (list == null) {
                    list = Collections.emptyList();
                }
            }
        }
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        Uri[] uriArr = new Uri[4];
        if (!a) {
            if (i > 0) {
                uri4 = m65088a((aocr) list.get(0));
                i2 = 1;
            } else {
                uri4 = null;
                i2 = 0;
            }
            uriArr[0] = uri4;
        } else {
            uriArr[0] = str5 != null ? anuc.m65336a(str5) : f77566a;
            i2 = 0;
        }
        if (i > i2) {
            i3 = i2 + 1;
            uri = m65088a((aocr) list.get(i2));
        } else {
            i3 = i2;
            uri = null;
        }
        uriArr[1] = uri;
        if (i > i3) {
            i4 = i3 + 1;
            uri2 = m65088a((aocr) list.get(i3));
        } else {
            i4 = i3;
            uri2 = null;
        }
        uriArr[2] = uri2;
        if (i > i4) {
            uri3 = m65088a((aocr) list.get(i4));
        } else {
            uri3 = null;
        }
        char c2 = 3;
        uriArr[3] = uri3;
        Resources resources = context.getResources();
        Locale locale = resources.getConfiguration().locale;
        aoct f2 = aocu.mo42535f();
        if (f2 == null || (b2 = f2.mo42531b()) == null) {
            i5 = 0;
        } else {
            i5 = (int) b2.mo42529b();
        }
        ArrayList arrayList = new ArrayList();
        aoct f3 = aocu.mo42535f();
        if (!(f3 == null || (b = f3.mo42531b()) == null || (c = b.mo42530c()) == null)) {
            int i6 = 0;
            while (i6 < c.size() && i6 < 4) {
                arrayList.add(((aocr) c.get(i6)).mo42527b().split(" ")[0]);
                i6++;
            }
        }
        int min = Math.min(arrayList.size(), true - (a ? 1 : 0));
        ansb ansb = new ansb();
        if (a || !arrayList.isEmpty()) {
            int size = a + arrayList.size();
            if (i5 < size) {
                i5 = size;
            }
            ansb.f77572d = ansc.m65095a(resources, locale, i5);
            if (!a) {
                str7 = null;
            } else if (i5 == 1) {
                ansb.f77569a = resources.getString(C0126R.string.plus_one_social_annotation_suffix, resources.getString(C0126R.string.plus_one_social_annotation_user));
                ansb.f77570b = resources.getString(C0126R.string.plus_one_social_annotation_user);
            } else {
                str7 = resources.getString(C0126R.string.plus_one_social_annotation_prefix_you, resources.getString(C0126R.string.plus_one_social_annotation_user));
            }
            int i7 = 0;
            while (i7 < min) {
                String str9 = (String) arrayList.get(i7);
                if (str7 == null) {
                    str8 = resources.getString(C0126R.string.plus_one_social_annotation_prefix, str9);
                } else {
                    str8 = resources.getString(C0126R.string.plus_one_social_annotation_separator, str7, str9);
                }
                str7 = str8;
                i7++;
                c2 = 3;
            }
            Integer valueOf = Integer.valueOf(i5);
            ansb.f77569a = resources.getString(C0126R.string.plus_one_annotation_count_prefix, valueOf, str7);
            ansb.f77570b = resources.getString(C0126R.string.plus_one_annotation_count_only, valueOf);
        } else {
            ansb.f77572d = ansc.m65095a(resources, locale, i5);
            if (i5 == 0) {
                ansb.f77569a = resources.getString(C0126R.string.plus_one_annotation_none);
                ansb.f77570b = resources.getString(C0126R.string.plus_one_annotation_none_short);
            } else {
                Integer valueOf2 = Integer.valueOf(i5);
                ansb.f77569a = resources.getString(C0126R.string.plus_one_annotation_count_prefix, valueOf2, resources.getString(C0126R.string.plus_one_annotation_none));
                ansb.f77570b = resources.getString(C0126R.string.plus_one_annotation_count_prefix, valueOf2, resources.getString(C0126R.string.plus_one_annotation_none_short));
                ansb.f77571c = resources.getString(C0126R.string.plus_one_annotation_count_only, valueOf2);
            }
        }
        String[] strArr = new String[4];
        strArr[0] = ansb.f77569a;
        strArr[1] = ansb.f77570b;
        strArr[2] = ansb.f77571c;
        strArr[c2] = ansb.f77572d;
        String b4 = aocu.mo42532b();
        if (!a) {
            str6 = "com.google.android.gms.plus.action.PLUS_ONE";
        } else {
            str6 = "com.google.android.gms.plus.action.UNDO_PLUS_ONE";
        }
        return new anta(str2, a, ansb.f77572d, strArr, uriArr, new Intent(str6).setClassName(context, "com.google.android.gms.plus.plusone.PlusOneActivity").putExtra("com.google.android.gms.plus.intent.extra.ACCOUNT", str).putExtra("com.google.android.gms.plus.intent.extra.EXTRA_SIGNED_UP", z).putExtra("com.google.android.gms.plus.intent.extra.TOKEN", b4).putExtra("com.google.android.gms.plus.intent.extra.URL", str2), b4, str3, str4);
    }

    /* renamed from: a */
    static void m65090a(PlusonesEntity plusonesEntity, int i) {
        PlusonesEntity.MetadataEntity.GlobalCountsEntity globalCountsEntity;
        PlusonesEntity.MetadataEntity metadataEntity = plusonesEntity.f82625g;
        if (metadataEntity != null && (globalCountsEntity = metadataEntity.f82631e) != null) {
            FastJsonResponse$Field d = FastJsonResponse$Field.m22662d("count", 2);
            double d2 = globalCountsEntity.f82637c;
            double d3 = (double) i;
            Double.isNaN(d3);
            globalCountsEntity.mo25607a(d, d2 + d3);
        }
    }

    /* renamed from: a */
    static void m65091a(PlusonesEntity plusonesEntity, boolean z) {
        plusonesEntity.mo25609a(FastJsonResponse$Field.m22664e("isSetByViewer", 5), z);
    }

    /* renamed from: a */
    public static boolean m65092a(aocu aocu) {
        return aocu.mo42534d() && aocu.mo42533c();
    }

    /* renamed from: a */
    public static boolean m65093a(aoda aoda) {
        Boolean asBoolean = aoda.f44539a.getAsBoolean("isSetByViewer");
        if (asBoolean != null) {
            return asBoolean.booleanValue();
        }
        return false;
    }
}
