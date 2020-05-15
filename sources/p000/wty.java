package p000;

import android.content.ContentResolver;
import java.util.List;

/* renamed from: wty */
final /* synthetic */ class wty implements bure {

    /* renamed from: a */
    private final wuc f51333a;

    public wty(wuc wuc) {
        this.f51333a = wuc;
    }

    /* renamed from: a */
    public final void mo29352a(List list) {
        wuc wuc = this.f51333a;
        srn srn = wtw.f51331a;
        list.size();
        wuc.f51348b.clear();
        wuc.f51348b.addAll(list);
        if (wuc.getContext() != null) {
            ContentResolver contentResolver = wuc.getContext().getContentResolver();
            contentResolver.notifyChange(busp.m120391a("device_status_list_item"), null);
            contentResolver.notifyChange(busp.m120391a("pair_header_suggestion"), null);
        }
    }
}
