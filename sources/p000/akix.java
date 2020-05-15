package p000;

import android.os.Message;
import com.google.android.gms.nearby.sharing.view.ContentView;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: akix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akix extends adzt {

    /* renamed from: a */
    private final WeakReference f72065a;

    public akix(ContentView contentView) {
        this.f72065a = new WeakReference(contentView);
    }

    public final void handleMessage(Message message) {
        ContentView contentView = (ContentView) this.f72065a.get();
        if (contentView != null && message.what == 1) {
            contentView.mo44650a((List) message.obj);
        }
    }
}
