package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;
import java.util.Date;

/* renamed from: bric */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bric {

    /* renamed from: a */
    public final Bundle f142860a;

    /* renamed from: b */
    private final String f142861b;

    /* renamed from: c */
    private Thing.Metadata f142862c;

    /* renamed from: d */
    private String f142863d;

    public bric() {
        this("Action");
    }

    /* renamed from: a */
    public static void m114028a(Bundle bundle, String str, long... jArr) {
        sdo.m34959a((Object) str);
        sdo.m34959a(jArr);
        int length = jArr.length;
        if (length > 0) {
            if (length >= 100) {
                briy.m114097a("Input Array of elements is too big, cutting off.");
                jArr = Arrays.copyOf(jArr, 100);
            }
            bundle.putLongArray(str, jArr);
            return;
        }
        briy.m114097a("Long array is empty and is ignored by put method.");
    }

    /* renamed from: b */
    public final void mo69557b(String str) {
        sdo.m34959a((Object) str);
        this.f142863d = str;
    }

    /* renamed from: c */
    public final void mo69558c(String str) {
        sdo.m34959a((Object) str);
        mo69553a("name", str);
    }

    /* renamed from: d */
    public final void mo69559d(String str) {
        mo69553a("telephone", str);
    }

    public bric(String str) {
        sdo.m34959a((Object) str);
        sdo.m34977c(str);
        this.f142860a = new Bundle();
        this.f142861b = str;
    }

    /* renamed from: a */
    public static void m114029a(Bundle bundle, String str, Thing... thingArr) {
        sdo.m34959a((Object) str);
        sdo.m34959a(thingArr);
        if (thingArr.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < thingArr.length; i2++) {
                thingArr[i] = thingArr[i2];
                if (thingArr[i2] == null) {
                    StringBuilder sb = new StringBuilder(58);
                    sb.append("Thing at ");
                    sb.append(i2);
                    sb.append(" is null and is ignored by put method.");
                    briy.m114097a(sb.toString());
                } else {
                    i++;
                }
            }
            if (i > 0) {
                bundle.putParcelableArray(str, (Parcelable[]) m114031a((Thing[]) Arrays.copyOfRange(thingArr, 0, i)));
                return;
            }
            return;
        }
        briy.m114097a("Thing array is empty and is ignored by put method.");
    }

    /* renamed from: a */
    public static long[] m114030a(Date... dateArr) {
        long[] jArr = new long[dateArr.length];
        for (int i = 0; i < dateArr.length; i++) {
            jArr[i] = dateArr[i].getTime();
        }
        return jArr;
    }

    /* renamed from: a */
    private static Object[] m114031a(Object[] objArr) {
        if (objArr.length < 100) {
            return objArr;
        }
        briy.m114097a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(objArr, 100);
    }

    /* renamed from: a */
    public final brhy mo69547a() {
        Bundle bundle = new Bundle(this.f142860a);
        Thing.Metadata metadata = this.f142862c;
        if (metadata == null) {
            metadata = new brhx().mo69540a();
        }
        return new Thing(bundle, metadata, this.f142863d, this.f142861b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo69548a(brhx brhx) {
        sdo.m34971a(this.f142862c == null, (Object) "setMetadata may only be called once");
        sdo.m34959a(brhx);
        this.f142862c = brhx.mo69540a();
    }

    /* renamed from: a */
    public final void mo69549a(bric bric) {
        mo69552a("sender", bric);
    }

    /* renamed from: a */
    public final void mo69550a(String str) {
        sdo.m34959a((Object) str);
        mo69553a("image", str);
    }

    /* renamed from: a */
    public final void mo69551a(String str, long... jArr) {
        m114028a(this.f142860a, str, jArr);
    }

    /* renamed from: a */
    public final void mo69552a(String str, bric... bricArr) {
        sdo.m34959a((Object) str);
        sdo.m34959a(bricArr);
        int length = bricArr.length;
        if (length > 0) {
            Thing[] thingArr = new Thing[length];
            for (int i = 0; i < bricArr.length; i++) {
                bric bric = bricArr[i];
                if (bric == null) {
                    StringBuilder sb = new StringBuilder(60);
                    sb.append("Builder at ");
                    sb.append(i);
                    sb.append(" is null and is ignored by put method.");
                    briy.m114097a(sb.toString());
                } else {
                    thingArr[i] = (Thing) bric.mo69547a();
                }
            }
            m114029a(this.f142860a, str, thingArr);
            return;
        }
        briy.m114097a("Builder array is empty and is ignored by put method.");
    }

    /* renamed from: a */
    public final void mo69553a(String str, String... strArr) {
        Bundle bundle = this.f142860a;
        sdo.m34959a((Object) str);
        sdo.m34959a(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
                String str2 = strArr2[i2];
                strArr2[i] = str2;
                if (strArr2[i2] == null) {
                    StringBuilder sb = new StringBuilder(59);
                    sb.append("String at ");
                    sb.append(i2);
                    sb.append(" is null and is ignored by put method.");
                    briy.m114097a(sb.toString());
                } else {
                    if (str2.length() > 20000) {
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("String at ");
                        sb2.append(i2);
                        sb2.append(" is too long, truncating string.");
                        briy.m114097a(sb2.toString());
                        strArr2[i] = brjg.m114102a(strArr2[i]);
                    }
                    i++;
                }
            }
            if (i > 0) {
                bundle.putStringArray(str, (String[]) m114031a((Object[]) ((String[]) Arrays.copyOfRange(strArr2, 0, i))));
                return;
            }
            return;
        }
        briy.m114097a("String array is empty and is ignored by put method.");
    }

    /* renamed from: a */
    public final void mo69554a(String str, boolean... zArr) {
        Bundle bundle = this.f142860a;
        sdo.m34959a((Object) str);
        sdo.m34959a(zArr);
        int length = zArr.length;
        if (length <= 0) {
            briy.m114097a("Boolean array is empty and is ignored by put method.");
            return;
        }
        if (length >= 100) {
            briy.m114097a("Input Array of elements is too big, cutting off.");
            zArr = Arrays.copyOf(zArr, 100);
        }
        bundle.putBooleanArray(str, zArr);
    }

    /* renamed from: a */
    public final void mo69555a(bric... bricArr) {
        mo69552a("recipient", bricArr);
    }

    /* renamed from: a */
    public final void mo69556a(String... strArr) {
        mo69553a("labels", strArr);
    }
}
