package p000;

import android.view.View;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: azxv */
public final /* synthetic */ class azxv implements View.OnClickListener {

    /* renamed from: a */
    private final OpenSearchView f100182a;

    public azxv(OpenSearchView openSearchView) {
        this.f100182a = openSearchView;
    }

    public void onClick(View view) {
        OpenSearchView openSearchView = this.f100182a;
        openSearchView.f111270i.setText("");
        openSearchView.mo60452g();
    }
}
