package p000;

import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.concurrent.Callable;

/* renamed from: ampw */
public final /* synthetic */ class ampw implements Callable {

    /* renamed from: a */
    private final PeopleGalChimeraProvider f75698a;

    /* renamed from: b */
    private final String[] f75699b;

    /* renamed from: c */
    private final String f75700c;

    /* renamed from: d */
    private final String f75701d;

    /* renamed from: e */
    private final long f75702e;

    /* renamed from: f */
    private final bxvd f75703f;

    public ampw(PeopleGalChimeraProvider peopleGalChimeraProvider, String[] strArr, String str, String str2, long j, bxvd bxvd) {
        this.f75698a = peopleGalChimeraProvider;
        this.f75699b = strArr;
        this.f75700c = str;
        this.f75701d = str2;
        this.f75702e = j;
        this.f75703f = bxvd;
    }

    public final Object call() {
        return this.f75698a.mo46471a(this.f75699b, this.f75700c, this.f75701d, this.f75702e, this.f75703f);
    }
}
