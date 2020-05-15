package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.FelicaException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.firebase.appindexing.internal.Thing;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: abxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxr {
    /* renamed from: a */
    public static int m48488a(bpzq bpzq) {
        bpzq bpzq2 = bpzq.NO_ERROR;
        switch (bpzq.ordinal()) {
            case 0:
            case 18:
                return 0;
            case 1:
            case 5:
            case 50:
                int a = bpzq.mo3214a();
                StringBuilder sb = new StringBuilder(60);
                sb.append("Cannot translate error to be sent to the client: ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            case 35:
            case 36:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
            case FelicaException.TYPE_USED_BY_OTHER_APP:
            case FelicaException.TYPE_PUSH_FAILED:
            case 41:
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return 17510;
            case 3:
            case 4:
                return 17600;
            case 20:
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return 17511;
            case 22:
                return 17514;
            case 24:
                return 17601;
            case 32:
                return 17512;
            case 33:
                return 17513;
            case FelicaException.TYPE_RESET_FAILED:
                return 17515;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return 17602;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return 17516;
            case 47:
                return 17517;
            case 48:
                return 17518;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return 17519;
            default:
                return 17500;
        }
    }

    /* renamed from: b */
    public static void m48492b(Thing thing) {
        String str;
        long[] b = thing.f152371c.mo72360b("scope");
        if (b != null) {
            int length = b.length;
            if (length != 1 || !brib.m114025a((int) b[0])) {
                if (length <= 0) {
                    str = "unknown";
                } else {
                    str = Arrays.toString(b);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
                sb.append("The scope of this indexable is not valid, scope value is ");
                sb.append(str);
                sb.append(".");
                throw new abxq(sb.toString(), thing, bpzq.INVALID_INDEXABLE_INVALID_SCOPE);
            }
        }
    }

    /* renamed from: c */
    public static int m48493c(Thing thing) {
        long[] b = thing.f152371c.mo72360b("scope");
        if (b == null) {
            return m48491a(thing) ? 2 : 1;
        }
        m48492b(thing);
        return (int) b[0];
    }

    /* renamed from: a */
    private static void m48489a(Thing thing, String str, Context context, boolean z, int i, abxt abxt) {
        boolean[] zArr;
        Thing[] thingArr;
        Thing thing2 = thing;
        String str2 = str;
        int i2 = i;
        abxt abxt2 = abxt;
        if (i2 <= 5) {
            String str3 = thing2.f152372d;
            if (!TextUtils.isEmpty(str3)) {
                try {
                    abyf.m48535a(str3);
                } catch (IllegalArgumentException e) {
                    throw new abxq(e.getMessage(), thing2, bpzq.INVALID_ARGUMENT_URI, e);
                }
            }
            String[] b = thing2.mo72351b("image");
            if (b != null) {
                try {
                    for (String str4 : b) {
                        abyf.m48535a(str4);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new abxq(e2.getMessage(), thing2, bpzq.INVALID_ARGUMENT_URI, e2);
                }
            }
            String[] b2 = thing2.mo72351b("sameAs");
            if (b2 != null) {
                try {
                    for (String str5 : b2) {
                        abyf.m48536b(str5);
                    }
                } catch (IllegalArgumentException e3) {
                    throw new abxq(e3.getMessage(), thing2, bpzq.INVALID_INDEXABLE_INVALID_WEB_URL, e3);
                }
            }
            if (i2 != 0 && !thing2.f152371c.mo72358a()) {
                throw new abxq("Metadata can only be set on the top-level Indexable.", thing2, bpzq.INVALID_INDEXABLE_METADATA_AT_NON_TOP_LEVEL);
            } else if (z && !thing2.f152371c.mo72358a()) {
                throw new abxq("Metadata can not be set in the patch Indexable.", thing2, bpzq.INVALID_INDEXABLE_BAD_PATCH);
            } else if (((Boolean) acaw.f59387g.mo58455c()).booleanValue() || m48491a(thing)) {
                m48492b(thing);
                if (i2 == 0) {
                    String str6 = thing2.f152372d;
                    if (TextUtils.isEmpty(str6)) {
                        throw new abxq("The URL of the top-level Indexable isn't set. Call the builder's setUrl() method.", thing2, bpzq.INVALID_INDEXABLE_MISSING_REQUIRED_FIELD);
                    } else if (str6.length() <= 256) {
                        String str7 = thing2.f152373e;
                        if (!((String) abzt.f58874aO.mo58455c()).isEmpty() && sqc.m35963b(((String) abzt.f58874aO.mo58455c()).split(","), str7)) {
                            String str8 = thing2.f152373e;
                            StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 55);
                            sb.append("Handling of indexables of type '");
                            sb.append(str8);
                            sb.append("' is not supported yet.");
                            throw new abxq(sb.toString(), thing2, bpzq.FEATURE_OFF);
                        } else if (!abxt2.f58702b.contains(thing2.f152373e)) {
                            String[] b3 = thing2.mo72351b("sameAs");
                            if (b3 != null && b3.length > 1) {
                                throw new abxq("The sameAs field of the top-level Indexable cannot be repeated.", thing2, bpzq.INVALID_INDEXABLE_SAME_AS_FIELD_REPEATED);
                            } else if (((Boolean) abzt.f58902aq.mo58455c()).booleanValue() && !context.getPackageName().equals(str2) && (!cemw.f183016a.mo6606a().mo79382l() || m48493c(thing) != 1)) {
                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(thing2.f152372d));
                                intent.setPackage(str2);
                                if (context.getPackageManager().queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).isEmpty()) {
                                    String valueOf = String.valueOf(intent);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 29);
                                    sb2.append("Intent '");
                                    sb2.append(valueOf);
                                    sb2.append("' cannot be resolved.");
                                    throw new abxq(sb2.toString(), thing2, bpzq.INVALID_INDEXABLE_INTENT_NOT_HANDLED);
                                }
                            }
                        } else {
                            String str9 = thing2.f152373e;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str9).length() + 121);
                            sb3.append("Indexable of type ");
                            sb3.append(str9);
                            sb3.append(" can only be used as a parameter in other builders, it cannot be passed to the update() method directly");
                            throw new abxq(sb3.toString(), thing2, bpzq.INVALID_INDEXABLE_INVALID_TYPE_AT_TOP_LEVEL);
                        }
                    } else {
                        throw new abxq("URL too long (max 256 characters).", thing2, bpzq.INVALID_ARGUMENT_URI_TOO_LONG);
                    }
                }
                boolean z2 = i2 == 0;
                bxwc bxwc = abxt2.mo32423a(thing2.f152373e, z2).f58533d;
                int size = bxwc.size();
                int i3 = 0;
                while (i3 < size) {
                    abvf abvf = (abvf) bxwc.get(i3);
                    List a = abxt.m48505a(thing2, abvf.f58522b);
                    int a2 = abve.m48319a(abvf.f58523c);
                    if (a2 == 0 || a2 == 1 || a.size() <= 1) {
                        if (z2) {
                            if (!z) {
                                int a3 = abve.m48319a(abvf.f58523c);
                                if (a3 != 0 && a3 == 3 && a.isEmpty()) {
                                    String str10 = abvf.f58522b;
                                    throw new abxq(String.format("The %s field of the top-level Indexable isn't set. Call the builder's set%s%s() method.", str10, str10.substring(0, 1).toUpperCase(Locale.US), str10.substring(1)), thing2, bpzq.INVALID_INDEXABLE_MISSING_REQUIRED_FIELD);
                                }
                            } else if (!a.isEmpty() && !((Boolean) acaw.f59313aq.mo58455c()).booleanValue()) {
                                String str11 = abvf.f58522b;
                                throw new abxq(String.format("The predefined %s field of the top-level Indexable is set. Don't call the builder's set%s%s() method.", str11, str11.substring(0, 1).toUpperCase(Locale.US), str11.substring(1)), thing2, bpzq.INVALID_INDEXABLE_BAD_PATCH);
                            }
                        }
                        i3++;
                    } else {
                        throw new abxq(String.format("The %s field of type %s cannot be repeated.", abvf.f58522b, thing.mo72350b()), thing2, bpzq.INVALID_INDEXABLE_INVALID_REPEATED_FIELD);
                    }
                }
                if (thing2.f152370b.size() <= 20) {
                    for (String str12 : thing2.f152370b.keySet()) {
                        if (str12 == null) {
                            throw new abxq("Property key cannot be null.", thing2, bpzq.INVALID_ARGUMENT_NULL);
                        } else if (str12.length() <= 50) {
                            String[] b4 = thing2.mo72351b(str12);
                            Thing[] a4 = thing2.mo72349a(str12);
                            long[] c = thing2.mo72352c(str12);
                            double[] d = thing2.mo72353d(str12);
                            byte[] bArr = null;
                            if (thing2.f152370b.get(str12) instanceof boolean[]) {
                                zArr = thing2.f152370b.getBooleanArray(str12);
                            } else {
                                zArr = null;
                            }
                            if (b4 != null) {
                                if (b4.length > 100) {
                                    b4 = (String[]) Arrays.copyOf(b4, 100);
                                    thing2.f152370b.putStringArray(str12, b4);
                                }
                                for (int i4 = 0; i4 < b4.length; i4++) {
                                    b4[i4] = brjg.m114102a(b4[i4]);
                                }
                            } else if (a4 != null) {
                                if (a4.length > 100) {
                                    Thing[] thingArr2 = (Thing[]) Arrays.copyOf(a4, 100);
                                    thing2.f152370b.putParcelableArray(str12, thingArr2);
                                    thingArr = thingArr2;
                                } else {
                                    thingArr = a4;
                                }
                                for (Thing thing3 : thingArr) {
                                    m48489a(thing3, str, context, z, i2 + 1, abxt);
                                }
                            } else if (c != null) {
                                if (c.length > 100) {
                                    thing2.f152370b.putLongArray(str12, Arrays.copyOf(c, 100));
                                }
                            } else if (d != null) {
                                if (d.length > 100) {
                                    thing2.f152370b.putDoubleArray(str12, Arrays.copyOf(d, 100));
                                }
                            } else if (zArr == null) {
                                if (thing2.f152370b.get(str12) instanceof byte[]) {
                                    bArr = thing2.f152370b.getByteArray(str12);
                                }
                                if (bArr == null) {
                                    Object obj = thing2.f152370b.get(str12);
                                    if (!z && obj == null) {
                                        throw new abxq("Property value cannot be null.", thing2, bpzq.INVALID_ARGUMENT_NULL);
                                    } else if (!z || obj != null) {
                                        String valueOf2 = String.valueOf(obj.getClass());
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                                        sb4.append("Indexable contains unsupported data type: ");
                                        sb4.append(valueOf2);
                                        sb4.append(".");
                                        throw new abxq(sb4.toString(), thing2, bpzq.INVALID_INDEXABLE_UNSUPPORTED_DATA_TYPE);
                                    }
                                } else {
                                    continue;
                                }
                            } else if (zArr.length > 100) {
                                thing2.f152370b.putBooleanArray(str12, Arrays.copyOf(zArr, 100));
                            }
                        } else {
                            throw new abxq(str12.length() == 0 ? new String("Key string length is longer than 50, key : ") : "Key string length is longer than 50, key : ".concat(str12), thing2, bpzq.INVALID_INDEXABLE_STRING_KEY_TOO_LONG);
                        }
                    }
                    return;
                }
                throw new abxq("Indexable contains more than 20 fields.", thing2, bpzq.INVALID_INDEXABLE_TOO_MANY_FIELDS);
            } else {
                throw new abxq("Handling of non-global searchable indexables is not supported yet.", thing2, bpzq.INVALID_INDEXABLE);
            }
        } else {
            throw new abxq("Nested Indexable cannot be deeper than 5 levels.", thing2, bpzq.INVALID_INDEXABLE_OVER_MAX_NESTING_DEPTH);
        }
    }

    /* renamed from: a */
    public static void m48490a(Thing[] thingArr, String str, Context context, boolean z, abxt abxt) {
        Intent intent;
        if (thingArr != null) {
            int length = thingArr.length;
            if (length <= 1000) {
                int i = 0;
                while (i < length) {
                    Thing thing = thingArr[i];
                    if (thing != null) {
                        Bundle bundle = thing.f152370b;
                        if (bundle != null) {
                            try {
                                bundle.keySet();
                                String[] a = thing.f152371c.mo72359a("sliceUri");
                                if (a != null && a.length > 0) {
                                    Uri parse = Uri.parse(a[0]);
                                    if (((Boolean) acaw.f59317au.mo58455c()).booleanValue()) {
                                        int i2 = Build.VERSION.SDK_INT;
                                        if (!"vnd.android.slice".equals(context.getContentResolver().getType(parse))) {
                                            throw new abxx("Slice error. Given Slice Uri is not a SLICE_TYPE Uri.", parse, bpzq.INVALID_SLICE_URI_TYPE);
                                        }
                                    }
                                    if (celu.f182917a.mo6606a().mo79291h() && !context.getPackageManager().resolveContentProvider(parse.getAuthority(), 0).packageName.equals(str)) {
                                        throw new abxx("Slice error. Invalid Slice Uri authority.", parse, bpzq.INVALID_SLICE_AUTHORITY);
                                    } else if (((Boolean) acaw.f59315as.mo58455c()).booleanValue()) {
                                        int i3 = Build.VERSION.SDK_INT;
                                        try {
                                            int i4 = context.getPackageManager().getApplicationInfo(str, 0).flags & 2;
                                            if (!((Boolean) acaw.f59272aB.mo58455c()).booleanValue() || i4 != 0) {
                                                try {
                                                    intent = Intent.parseUri(thing.f152372d, 3);
                                                } catch (URISyntaxException e) {
                                                    intent = new Intent("android.intent.action.VIEW", Uri.parse(thing.f152372d));
                                                }
                                                if (intent.getComponent() == null && intent.getPackage() == null) {
                                                    intent.setPackage(str);
                                                }
                                                try {
                                                    Uri mapIntentToUri = apr.m1818a(context).f1944b.mapIntentToUri(intent);
                                                    if (mapIntentToUri == null) {
                                                        throw new abxx("Slice error. Could not map the Indexable url to the given Slice Uri.", parse, bpzq.INVALID_SLICE_ARGUMENT);
                                                    } else if (!parse.equals(mapIntentToUri)) {
                                                        throw new abxx("Slice error. Slice Uri mapped from SliceProvider does not match the Slice Uri in the Indexable.", parse, bpzq.INVALID_SLICE_ARGUMENT);
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    throw new abxx("Slice error. Could not map the Indexable url to the given Slice Uri.", parse, bpzq.INVALID_SLICE_ARGUMENT);
                                                }
                                            }
                                        } catch (PackageManager.NameNotFoundException e3) {
                                            throw new abxq("Unknown client package name.", thing, bpzq.INVALID_REQUEST, e3);
                                        }
                                    }
                                }
                                Thing a2 = abyc.m48524a(thing);
                                thingArr[i] = a2;
                                try {
                                    m48489a(a2, str, context, z, 0, abxt);
                                    caef b = abyd.m48530b(a2);
                                    int i5 = b.f164961ai;
                                    if (i5 == -1) {
                                        i5 = bxxm.f165037a.mo74228a(b).mo74223b(b);
                                        b.f164961ai = i5;
                                    }
                                    if (i5 <= 30000) {
                                        i++;
                                    } else {
                                        StringBuilder sb = new StringBuilder(92);
                                        sb.append("Indexable is ");
                                        sb.append(i5);
                                        sb.append(" bytes, which is larger than the maximum allowed size of 30000 bytes");
                                        throw new abxq(sb.toString(), a2, bpzq.INVALID_INDEXABLE_TOO_LARGE);
                                    }
                                } catch (abxq e4) {
                                    throw new abxq(e4.getMessage(), a2, e4.f58694a);
                                }
                            } catch (RuntimeException e5) {
                                throw new abxq("Properties contain bad parcelable.", thing, bpzq.INVALID_INDEXABLE_BAD_PARCELABLE, e5);
                            }
                        } else {
                            throw new abxq("Properties cannot be null.", thing, bpzq.INVALID_ARGUMENT_NULL);
                        }
                    } else {
                        throw new abxq("Indexable cannot be null.", bpzq.INVALID_ARGUMENT_NULL);
                    }
                }
                return;
            }
            throw new abxq("Providing more than 1000 indexables in one update call is not allowed.", bpzq.INVALID_ARGUMENT_TOO_MANY);
        }
        throw new abxq("Indexables cannot be null.", bpzq.INVALID_ARGUMENT_NULL);
    }

    /* renamed from: a */
    public static boolean m48491a(Thing thing) {
        boolean[] c = thing.f152371c.mo72361c("isGlobalSearchable");
        return c == null || c.length == 0 || c[0];
    }
}
