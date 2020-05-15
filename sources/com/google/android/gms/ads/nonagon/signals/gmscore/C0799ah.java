package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.signals.C0786c;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0799ah implements C0786c {

    /* renamed from: a */
    private final List f9240a;

    public C0799ah(List list) {
        this.f9240a = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7056a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f9240a));
        } catch (JSONException e) {
        }
    }
}
