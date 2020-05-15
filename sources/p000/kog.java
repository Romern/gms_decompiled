package p000;

import android.app.assist.AssistStructure;
import android.content.ComponentName;

/* renamed from: kog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kog {
    /* renamed from: a */
    public static bngx m18243a(AssistStructure assistStructure) {
        bngs b = bngx.m109371b(assistStructure.getWindowNodeCount());
        for (int i = 0; i < assistStructure.getWindowNodeCount(); i++) {
            AssistStructure.WindowNode windowNodeAt = assistStructure.getWindowNodeAt(i);
            ComponentName activityComponent = assistStructure.getActivityComponent();
            kop a = koq.m18263a();
            a.f24629a = activityComponent.getClassName();
            a.f24630b = kof.m18242a(windowNodeAt.getRootViewNode());
            windowNodeAt.getDisplayId();
            windowNodeAt.getLeft();
            windowNodeAt.getTop();
            a.mo14757a(windowNodeAt.getHeight(), windowNodeAt.getWidth());
            if (windowNodeAt.getTitle() != null) {
                windowNodeAt.getTitle().toString();
            }
            b.mo67668c(a.mo14756a());
        }
        return b.mo67664a();
    }
}
