package p000;

import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: azya */
public final /* synthetic */ class azya implements Runnable {

    /* renamed from: a */
    private final OpenSearchView f100189a;

    public azya(OpenSearchView openSearchView) {
        this.f100189a = openSearchView;
    }

    public final void run() {
        OpenSearchView openSearchView = this.f100189a;
        openSearchView.f111270i.requestFocus();
        openSearchView.mo60454i().showSoftInput(openSearchView.f111270i, 1);
    }
}
