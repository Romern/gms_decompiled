package p000;

import android.util.Pair;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;

/* renamed from: bjub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjub implements Response.Listener {

    /* renamed from: a */
    private final RequestFuture f123331a;

    public bjub(RequestFuture requestFuture) {
        this.f123331a = requestFuture;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        this.f123331a.onResponse(((Pair) obj).second);
    }
}
