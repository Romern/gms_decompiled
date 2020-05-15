package p000;

import android.view.View;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: azxx */
public final /* synthetic */ class azxx implements bhkl {

    /* renamed from: a */
    private final OpenSearchView f100184a;

    public azxx(OpenSearchView openSearchView) {
        this.f100184a = openSearchView;
    }

    /* renamed from: a */
    public final void mo55381a(View view, C1296qh qhVar, bhkm bhkm) {
        int i;
        int i2;
        OpenSearchView openSearchView = this.f100184a;
        boolean a = azxr.m86338a(openSearchView.f111267f);
        if (!a) {
            i = bhkm.f118913a;
        } else {
            i = bhkm.f118915c;
        }
        if (!a) {
            i2 = bhkm.f118915c;
        } else {
            i2 = bhkm.f118913a;
        }
        openSearchView.f111267f.setPadding(i + qhVar.mo15731a(), bhkm.f118914b, i2 + qhVar.mo15735c(), bhkm.f118916d);
    }
}
