package p000;

import android.text.TextUtils;
import android.util.Log;
import android.widget.Filter;
import com.felicanetworks.mfc.FelicaException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bkah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkah extends Filter {

    /* renamed from: a */
    final /* synthetic */ bkai f123791a;

    public bkah(bkai bkai) {
        this.f123791a = bkai;
    }

    public final CharSequence convertResultToString(Object obj) {
        if (obj instanceof bjtj) {
            return ((bjtj) obj).f123276e;
        }
        return super.convertResultToString(obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        bkah bkah = this;
        if (charSequence != null) {
            bkai bkai = bkah.f123791a;
            int i = bkai.f123792a;
            List list = bkai.f123798g;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    bjth bjth = (bjth) list.get(i2);
                    try {
                        bkai bkai2 = bkah.f123791a;
                        List a = bjth.mo65524a(charSequence, bkai2.f123795d, bkai2.f123796e, bkai2.f123793b, bkai2.f123794c);
                        String a2 = bjth.mo65523a();
                        if (a != null) {
                            ArrayList arrayList2 = new ArrayList();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it3 = a.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bjtj bjtj = (bjtj) it3.next();
                                    btwp btwp = bjtj.f123275d;
                                    if (btwp != null) {
                                        char c = 'A';
                                        if (!(bkah.f123791a.f123797f == null || btwp.f152745p.size() == 0)) {
                                            char[] cArr = bkah.f123791a.f123797f;
                                            int length = cArr.length;
                                            int i3 = 0;
                                            boolean z = false;
                                            while (true) {
                                                if (i3 < length) {
                                                    char c2 = cArr[i3];
                                                    if (!(c2 == 'A' || c2 == 'N')) {
                                                        switch (c2) {
                                                            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                                                            case '2':
                                                            case '3':
                                                                continue;
                                                            default:
                                                                if (bjtf.m104553a(c2)) {
                                                                    if (TextUtils.isEmpty(bjtg.m104555a(btwp, c2))) {
                                                                        z = true;
                                                                        break;
                                                                    } else {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                        }
                                                    }
                                                    i3++;
                                                } else if (z) {
                                                    continue;
                                                }
                                            }
                                        }
                                        btwp btwp2 = bjtj.f123275d;
                                        char[] cArr2 = bkah.f123791a.f123797f;
                                        if (cArr2 != null) {
                                            int length2 = cArr2.length;
                                            int i4 = 0;
                                            while (i4 < length2) {
                                                char c3 = cArr2[i4];
                                                if (c3 == c) {
                                                    c3 = '1';
                                                }
                                                char[] cArr3 = bkah.f123791a.f123796e;
                                                if (cArr3 != null) {
                                                    int length3 = cArr3.length;
                                                    it2 = it3;
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (i5 >= length3) {
                                                            continue;
                                                        } else if (cArr3[i5] != c3) {
                                                            i5++;
                                                        } else if (TextUtils.isEmpty(bjtg.m104555a(btwp2, c3))) {
                                                            String str = bjtj.f123274c;
                                                            if (TextUtils.isEmpty(str)) {
                                                                bkah = this;
                                                                it3 = it2;
                                                            } else if (!linkedHashMap.containsKey(str)) {
                                                                linkedHashMap.put(str, Integer.valueOf(arrayList2.size()));
                                                                bkah = this;
                                                                it3 = it2;
                                                            } else {
                                                                bkah = this;
                                                                it3 = it2;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    it2 = it3;
                                                }
                                                i4++;
                                                c = 'A';
                                                bkah = this;
                                                it3 = it2;
                                            }
                                        }
                                        it = it3;
                                    } else {
                                        it = it3;
                                    }
                                    if (!TextUtils.isEmpty(bjtj.f123276e)) {
                                        arrayList2.add(bjtj);
                                        if (arrayList2.size() < bkai.f123792a) {
                                            if (!TextUtils.isEmpty(bjtj.f123274c)) {
                                                linkedHashMap.put(bjtj.f123274c, -1);
                                                bkah = this;
                                                it3 = it;
                                            } else {
                                                bkah = this;
                                                it3 = it;
                                            }
                                        }
                                    } else {
                                        bkah = this;
                                        it3 = it;
                                    }
                                } else if (!linkedHashMap.isEmpty()) {
                                    int i6 = 0;
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        int intValue = ((Integer) entry.getValue()).intValue();
                                        if (intValue != -1) {
                                            String str2 = (String) entry.getKey();
                                            arrayList2.add(intValue + i6, new bjtj(str2, str2, a2, (String) null));
                                            if (arrayList2.size() < bkai.f123792a) {
                                                i6++;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null && !arrayList.isEmpty()) {
                        }
                    } catch (Throwable th) {
                        String valueOf = String.valueOf(bjth.mo65523a());
                        Log.e("AddressSourceResultAdap", valueOf.length() == 0 ? new String("Could not fetch addresses from ") : "Could not fetch addresses from ".concat(valueOf), th);
                    }
                    i2++;
                    bkah = this;
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }
        arrayList = new ArrayList();
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = arrayList;
        filterResults2.count = arrayList.size();
        return filterResults2;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        bkai bkai = this.f123791a;
        bkai.f123801j = charSequence;
        bkai.f123800i = bkai.f123799h;
        bkai.f123799h = (ArrayList) filterResults.values;
        ArrayList arrayList = bkai.f123799h;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f123791a.notifyDataSetInvalidated();
        } else {
            this.f123791a.notifyDataSetChanged();
        }
    }
}
