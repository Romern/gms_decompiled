package p000;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: azxw */
public final /* synthetic */ class azxw implements View.OnTouchListener {

    /* renamed from: a */
    private final OpenSearchView f100183a;

    public azxw(OpenSearchView openSearchView) {
        this.f100183a = openSearchView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OpenSearchView openSearchView = this.f100183a;
        if (!openSearchView.mo60455j()) {
            return false;
        }
        openSearchView.mo60453h();
        return false;
    }
}
