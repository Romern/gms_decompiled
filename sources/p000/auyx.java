package p000;

import com.android.volley.Response;
import java.util.function.Consumer;
import org.json.JSONObject;

/* renamed from: auyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyx implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ String f92805a;

    /* renamed from: b */
    final /* synthetic */ Consumer f92806b;

    public auyx(String str, Consumer consumer) {
        this.f92805a = str;
        this.f92806b = consumer;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        this.f92806b.accept(auza.m78104a(this.f92805a, (JSONObject) obj));
    }
}
