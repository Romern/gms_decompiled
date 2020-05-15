package p000;

import android.os.Bundle;

/* renamed from: abae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abae {

    /* renamed from: a */
    public int f56925a = -1;

    /* renamed from: b */
    public int f56926b = -1;

    /* renamed from: c */
    public int f56927c = -1;

    /* renamed from: d */
    public int f56928d = -1;

    /* renamed from: e */
    public Bundle f56929e = new Bundle();

    /* renamed from: a */
    public final abag mo31968a() {
        abag abag = new abag();
        Bundle bundle = new Bundle();
        bundle.putInt("title_res_id", this.f56925a);
        bundle.putInt("message_res_id", this.f56926b);
        bundle.putInt("positive_button_text_res_id", this.f56927c);
        bundle.putInt("negative_button_text_res_id", this.f56928d);
        bundle.putInt("button_text_color_res_id", -1);
        bundle.putBundle("extra_args", this.f56929e);
        abag.setArguments(bundle);
        return abag;
    }
}
