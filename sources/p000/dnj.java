package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreference;
import java.util.ArrayList;

/* renamed from: dnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dnj extends dnl {

    /* renamed from: a */
    public int f13625a;

    /* renamed from: c */
    private CharSequence[] f13626c;

    /* renamed from: d */
    private CharSequence[] f13627d;

    /* renamed from: a */
    private static void m8877a(Bundle bundle, String str, CharSequence[] charSequenceArr) {
        int length = charSequenceArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (CharSequence charSequence : charSequenceArr) {
            arrayList.add(charSequence.toString());
        }
        bundle.putStringArrayList(str, arrayList);
    }

    /* renamed from: c */
    private final ListPreference m8879c() {
        return (ListPreference) mo9309b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference c = m8879c();
            if (c.f1565h == null || c.f1566i == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f13625a = c.mo1968b(c.f1567j);
            this.f13626c = c.f1565h;
            this.f13627d = c.f1566i;
            return;
        }
        this.f13625a = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f13626c = m8878a(bundle, "ListPreferenceDialogFragment.entries");
        this.f13627d = m8878a(bundle, "ListPreferenceDialogFragment.entryValues");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f13625a);
        m8877a(bundle, "ListPreferenceDialogFragment.entries", this.f13626c);
        m8877a(bundle, "ListPreferenceDialogFragment.entryValues", this.f13627d);
    }

    /* renamed from: a */
    private static CharSequence[] m8878a(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return (CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9308a(C1349sg sgVar) {
        sgVar.mo15903a(this.f13626c, this.f13625a, new dni(this));
        sgVar.mo15909b((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: a */
    public final void mo9305a(boolean z) {
        int i;
        ListPreference c = m8879c();
        if (z && (i = this.f13625a) >= 0) {
            String charSequence = this.f13627d[i].toString();
            if (c.mo1988b((Object) charSequence)) {
                c.mo1967a(charSequence);
            }
        }
    }
}
