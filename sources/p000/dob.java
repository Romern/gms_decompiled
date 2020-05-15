package p000;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* renamed from: dob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dob extends HttpEntityWrapper {

    /* renamed from: g */
    public static final /* synthetic */ int f13667g = 0;

    /* renamed from: a */
    public final String f13668a;

    /* renamed from: b */
    public final int f13669b;

    /* renamed from: c */
    public final long f13670c;

    /* renamed from: d */
    public final long f13671d;

    /* renamed from: e */
    public final long f13672e;

    /* renamed from: f */
    public final long f13673f;

    public dob(HttpEntity httpEntity, String str, int i, long j, long j2, long j3, long j4) {
        super(httpEntity);
        this.f13668a = str;
        this.f13669b = i;
        this.f13670c = j;
        this.f13671d = j2;
        this.f13672e = j3;
        this.f13673f = j4;
    }

    public final InputStream getContent() {
        return new doa(this, dob.super.getContent());
    }
}
