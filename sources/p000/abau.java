package p000;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: abau */
public final /* synthetic */ class abau implements Observer {

    /* renamed from: a */
    private final HelpChimeraActivity f56959a;

    /* renamed from: b */
    private final String f56960b;

    /* renamed from: c */
    private final aask f56961c;

    /* renamed from: d */
    private final boolean f56962d;

    /* renamed from: e */
    private final boolean f56963e;

    public abau(HelpChimeraActivity helpChimeraActivity, String str, aask aask, boolean z, boolean z2) {
        this.f56959a = helpChimeraActivity;
        this.f56960b = str;
        this.f56961c = aask;
        this.f56962d = z;
        this.f56963e = z2;
    }

    public final void update(Observable observable, Object obj) {
        this.f56959a.mo43338a(this.f56960b, this.f56961c, this.f56962d, this.f56963e);
    }
}
