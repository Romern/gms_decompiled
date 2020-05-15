package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.view.ExpandableView;
import com.google.android.libraries.view.text.ExpandableTextView;

/* renamed from: akja */
public final /* synthetic */ class akja implements View.OnClickListener {

    /* renamed from: a */
    private final ExpandableView f72070a;

    public akja(ExpandableView expandableView) {
        this.f72070a = expandableView;
    }

    public void onClick(View view) {
        ExpandableTextView expandableTextView = this.f72070a.f81147a;
        if (expandableTextView.mo70845a()) {
            boolean z = !expandableTextView.f150658d;
            expandableTextView.f150658d = z;
            if (!z) {
                expandableTextView.f150656b.setIntValues(expandableTextView.getLineCount(), expandableTextView.f150659e);
            } else {
                expandableTextView.f150656b.setIntValues(expandableTextView.f150659e, expandableTextView.getLineCount());
            }
            expandableTextView.f150656b.start();
            if (expandableTextView.f150655a.mo66813a()) {
                ((View) expandableTextView.f150655a.mo66814b()).animate().rotation(!expandableTextView.f150658d ? 0.0f : 180.0f).setDuration(expandableTextView.f150660f);
            }
        }
    }
}
