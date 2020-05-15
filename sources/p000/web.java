package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: web */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class web {

    /* renamed from: a */
    private final Context f50574a;

    /* renamed from: b */
    private wea f50575b;

    /* renamed from: c */
    private wef f50576c;

    private web(Context context) {
        this.f50574a = context;
    }

    /* renamed from: a */
    public static web m41825a(Context context) {
        return new web(context);
    }

    /* renamed from: b */
    public final synchronized wef mo29056b() {
        if (this.f50576c == null) {
            this.f50576c = new wef(ModuleManager.get(this.f50574a));
        }
        return this.f50576c;
    }

    /* renamed from: a */
    public final synchronized wea mo29055a() {
        if (this.f50575b == null) {
            qws qws = null;
            if (!TextUtils.isEmpty(cdsb.m134800f())) {
                qws = new qws(this.f50574a.getApplicationContext(), cdsb.m134800f(), null);
            }
            this.f50575b = new wed(mo29056b(), qws);
        }
        return this.f50575b;
    }
}
