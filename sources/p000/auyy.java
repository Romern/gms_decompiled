package p000;

import com.android.volley.Response;
import java.util.function.BiConsumer;
import org.json.JSONObject;

/* renamed from: auyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auyy implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ String f92807a;

    /* renamed from: b */
    final /* synthetic */ BiConsumer f92808b;

    /* renamed from: c */
    final /* synthetic */ Boolean f92809c;

    public auyy(String str, BiConsumer biConsumer, Boolean bool) {
        this.f92807a = str;
        this.f92808b = biConsumer;
        this.f92809c = bool;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        this.f92808b.accept(auza.m78104a(this.f92807a, (JSONObject) obj), this.f92809c);
    }
}
