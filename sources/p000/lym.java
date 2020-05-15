package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: lym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lym {

    /* renamed from: a */
    public final Context f33193a;

    /* renamed from: b */
    public final bmzi f33194b = lyk.f33191a;

    /* renamed from: c */
    public final lxh f33195c;

    /* renamed from: d */
    public final bzsy f33196d = bzsy.m126181a(new bzse()).mo74580a();

    public lym(Context context) {
        this.f33193a = context;
        this.f33195c = new lxh(context);
    }

    /* renamed from: a */
    public static void m24666a(Uri.Builder builder, bzoa bzoa) {
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("request_header.experiment_overrides", bzoa.f170787b);
        bzod bzod = bzoa.f170786a;
        if (bzod == null) {
            bzod = bzod.f170795c;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("request_header.client_info.version", bzod.f170797a);
        bzod bzod2 = bzoa.f170786a;
        if (bzod2 == null) {
            bzod2 = bzod.f170795c;
        }
        appendQueryParameter2.appendQueryParameter("request_header.client_info.client_id", String.valueOf(bzod2.f170798b));
    }
}
