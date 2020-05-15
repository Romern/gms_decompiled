package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.android.gms.nearby.messages.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: dyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dyx extends drx {

    /* renamed from: c */
    final /* synthetic */ dzc f14449c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dyx(dzc dzc, String str) {
        super(str);
        this.f14449c = dzc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        HashSet hashSet = null;
        ArrayList arrayList = null;
        for (Map.Entry entry : this.f14449c.f14466k.entrySet()) {
            if (!((dzb) entry.getValue()).mo9888a()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((String) entry.getKey());
            }
        }
        if (arrayList != null) {
            this.f14449c.f14466k.keySet().removeAll(arrayList);
        }
        dzc dzc = this.f14449c;
        for (Message message : dzc.f14467l.keySet()) {
            if (!dzc.mo9889a(message.f80678d, message.f80677c, message.f80676b)) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(message);
            }
        }
        if (hashSet != null && !hashSet.isEmpty()) {
            WriteBatchImpl b = tjj.m37080b();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tip tip = new tip((ContextData) dzc.f14467l.remove((Message) it.next()));
                tip.mo26571a(dwq.m9665i().mo20505a());
                b.mo18101a(tip.mo26570a());
            }
            dzc.mo9852a(b);
        }
    }
}
