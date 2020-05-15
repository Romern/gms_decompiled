package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import java.util.EnumMap;

/* renamed from: biyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyk {

    /* renamed from: c */
    private static final String f122300c = biyk.class.getSimpleName();

    /* renamed from: d */
    private static biyk f122301d = null;

    /* renamed from: a */
    public Bundle f122302a = null;

    /* renamed from: b */
    public final EnumMap f122303b = new EnumMap(biyj.class);

    private biyk(Context context) {
        Bundle bundle = this.f122302a;
        if (bundle == null || bundle.isEmpty()) {
            try {
                this.f122302a = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").appendPath("getOverlayConfig").build(), "getOverlayConfig", (String) null, (Bundle) null);
                this.f122303b.clear();
            } catch (IllegalArgumentException e) {
                Log.w(f122300c, "Fail to get config from suw provider");
            }
        }
    }

    /* renamed from: a */
    private static final float m102976a(Context context, TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [biyj, android.graphics.drawable.Drawable]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: b */
    public final Drawable mo64870b(Context context, biyj biyj) {
        if (biyj.f122299N != 3) {
            throw new IllegalArgumentException("Not a drawable resource");
        } else if (this.f122303b.containsKey(biyj)) {
            return (Drawable) this.f122303b.get(biyj);
        } else {
            try {
                biyl a = mo64869a(context, biyj.f122298M);
                Resources resources = a.f122306b;
                int i = a.f122305a;
                TypedValue typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                if (typedValue.type == 1 && typedValue.data == 0) {
                    return null;
                }
                int i2 = Build.VERSION.SDK_INT;
                Drawable drawable = resources.getDrawable(i, null);
                this.f122303b.put((Enum) biyj, (Object) drawable);
                return drawable;
            } catch (Resources.NotFoundException | NullPointerException e) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [biyj, java.lang.String]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: c */
    public final String mo64871c(Context context, biyj biyj) {
        if (biyj.f122299N != 4) {
            throw new IllegalArgumentException("Not a string resource");
        } else if (this.f122303b.containsKey(biyj)) {
            return (String) this.f122303b.get(biyj);
        } else {
            try {
                biyl a = mo64869a(context, biyj.f122298M);
                String string = a.f122306b.getString(a.f122305a);
                try {
                    this.f122303b.put((Enum) biyj, (Object) string);
                    return string;
                } catch (NullPointerException e) {
                    return string;
                }
            } catch (NullPointerException e2) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [biyj, java.lang.Boolean]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: d */
    public final boolean mo64872d(Context context, biyj biyj) {
        if (biyj.f122299N != 1) {
            throw new IllegalArgumentException("Not a bool resource");
        } else if (this.f122303b.containsKey(biyj)) {
            return ((Boolean) this.f122303b.get(biyj)).booleanValue();
        } else {
            try {
                biyl a = mo64869a(context, biyj.f122298M);
                boolean z = a.f122306b.getBoolean(a.f122305a);
                try {
                    this.f122303b.put((Enum) biyj, (Object) Boolean.valueOf(z));
                    return z;
                } catch (NullPointerException e) {
                    return z;
                }
            } catch (NullPointerException e2) {
                return false;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [biyj, android.util.TypedValue]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: e */
    public final float mo64873e(Context context, biyj biyj) {
        if (biyj.f122299N != 5) {
            throw new IllegalArgumentException("Not a dimension resource");
        } else if (this.f122303b.containsKey(biyj)) {
            return m102976a(context, (TypedValue) this.f122303b.get(biyj));
        } else {
            try {
                biyl a = mo64869a(context, biyj.f122298M);
                Resources resources = a.f122306b;
                int i = a.f122305a;
                try {
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(i, typedValue, true);
                    if (typedValue.type == 5) {
                        this.f122303b.put((Enum) biyj, (Object) typedValue);
                        return m102976a(context, (TypedValue) this.f122303b.get(biyj));
                    }
                    String hexString = Integer.toHexString(i);
                    String hexString2 = Integer.toHexString(typedValue.type);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(hexString2).length());
                    sb.append("Resource ID #0x");
                    sb.append(hexString);
                    sb.append(" type #0x");
                    sb.append(hexString2);
                    sb.append(" is not valid");
                    throw new Resources.NotFoundException(sb.toString());
                } catch (NullPointerException e) {
                    return resources.getDimension(i);
                }
            } catch (NullPointerException e2) {
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static synchronized biyk m102977a(Context context) {
        biyk biyk;
        synchronized (biyk.class) {
            if (f122301d == null) {
                f122301d = new biyk(context);
            }
            biyk = f122301d;
        }
        return biyk;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [biyj, java.lang.Integer]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final int mo64868a(Context context, biyj biyj) {
        if (biyj.f122299N != 2) {
            throw new IllegalArgumentException("Not a color resource");
        } else if (this.f122303b.containsKey(biyj)) {
            return ((Integer) this.f122303b.get(biyj)).intValue();
        } else {
            try {
                biyl a = mo64869a(context, biyj.f122298M);
                Resources resources = a.f122306b;
                int i = a.f122305a;
                int i2 = Build.VERSION.SDK_INT;
                int color = resources.getColor(i, null);
                try {
                    this.f122303b.put((Enum) biyj, (Object) Integer.valueOf(color));
                    return color;
                } catch (NullPointerException e) {
                    return color;
                }
            } catch (NullPointerException e2) {
                return 0;
            }
        }
    }

    /* renamed from: a */
    public final biyl mo64869a(Context context, String str) {
        Bundle bundle = this.f122302a.getBundle(str);
        Bundle bundle2 = this.f122302a.getBundle("fallbackConfig");
        if (bundle2 != null) {
            bundle.putBundle("fallbackConfig", bundle2.getBundle(str));
        }
        return biyl.m102984a(context, bundle);
    }
}
