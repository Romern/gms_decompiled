package p000;

import android.view.View;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;

/* renamed from: abev */
public final /* synthetic */ class abev implements View.OnClickListener {

    /* renamed from: a */
    private final PopularArticlesContainer f57315a;

    public abev(PopularArticlesContainer popularArticlesContainer) {
        this.f57315a = popularArticlesContainer;
    }

    public void onClick(View view) {
        PopularArticlesContainer popularArticlesContainer = this.f57315a;
        popularArticlesContainer.f78995a.mo43351m();
        PopularArticlesContainer.m66609a(popularArticlesContainer.f78995a, 30, popularArticlesContainer.f78997c.f56497g, "");
        abgx.m47704a(popularArticlesContainer.f78995a, popularArticlesContainer.f78997c, 30, 0);
    }
}
