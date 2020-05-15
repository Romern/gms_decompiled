package p000;

import android.content.Context;
import android.text.format.Time;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.TimeUnit;

/* renamed from: vpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpt {

    /* renamed from: f */
    public static final long f49735f = TimeUnit.HOURS.toMillis(6);

    /* renamed from: a */
    public final long f49736a;

    /* renamed from: b */
    public final Time f49737b;

    /* renamed from: c */
    public final Context f49738c;

    /* renamed from: d */
    public final Time f49739d = new Time();

    /* renamed from: e */
    public final String f49740e = this.f49738c.getString(C0126R.string.common_never);

    public vpt(Context context, Time time) {
        this.f49738c = context;
        this.f49737b = time;
        this.f49736a = time.toMillis(false);
    }
}
