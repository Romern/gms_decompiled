package p000;

import com.google.android.gms.drive.p039ui.select.path.FolderPathElement;
import com.google.android.gms.drive.p039ui.select.path.PathStack;

/* renamed from: vnk */
public final /* synthetic */ class vnk implements rkl {

    /* renamed from: a */
    private final PathStack f49581a;

    public vnk(PathStack pathStack) {
        this.f49581a = pathStack;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        PathStack pathStack = this.f49581a;
        usv usv = (usv) rkk;
        if (usv.f48620a.mo17710c()) {
            pathStack.f31211c = PathStack.m23106a(new FolderPathElement(usv.f48621b));
            pathStack.mo18346a();
            return;
        }
        PathStack.f31209a.mo25375b("Could not retrieve metadata, status: %s", usv.f48620a);
    }
}
