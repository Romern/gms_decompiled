package p000;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Properties;

/* renamed from: bbqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqj {

    /* renamed from: c */
    private static bbqj f103069c;

    /* renamed from: a */
    public int f103070a;

    /* renamed from: b */
    public int f103071b;

    private bbqj(Context context) {
        int i;
        bbov.m88299a();
        try {
            Properties properties = new Properties();
            properties.load(context.getAssets().open("lighter-properties.txt"));
            this.f103070a = 2;
            String property = properties.getProperty("BUILD_BASELINE_CHANGELIST");
            if (!TextUtils.isEmpty(property)) {
                i = Integer.parseInt(property);
            } else {
                i = 0;
            }
            this.f103071b = i;
        } catch (IOException e) {
            throw new RuntimeException("Lighter properties was not found in the apk", e);
        }
    }

    /* renamed from: a */
    public static synchronized bbqj m88406a(Context context) {
        bbqj bbqj;
        synchronized (bbqj.class) {
            if (f103069c == null) {
                bbqj = new bbqj(context);
                f103069c = bbqj;
            } else {
                bbqj = f103069c;
            }
        }
        return bbqj;
    }
}
