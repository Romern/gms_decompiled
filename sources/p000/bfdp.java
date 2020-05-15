package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bfdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdp {

    /* renamed from: a */
    public final List f113496a;

    /* renamed from: b */
    public volatile String f113497b;

    /* renamed from: c */
    final /* synthetic */ bfdw f113498c;

    /* renamed from: d */
    private final List f113499d;

    /* renamed from: e */
    private final List f113500e = new ArrayList();

    /* renamed from: f */
    private Map f113501f = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    private Map f113502g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private Map f113503h = Collections.synchronizedMap(new HashMap());

    public bfdp(bfdw bfdw, List list, String str) {
        this.f113498c = bfdw;
        this.f113496a = list;
        this.f113497b = str;
        this.f113499d = bfib.m96839a();
        for (int i = 0; i < list.size(); i++) {
            this.f113499d.add(bfdq.NOT_READ_YET);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        return r0;
     */
    /* renamed from: a */
    public final synchronized bfia mo61470a(String str) {
        boolean z;
        bfia bfia = new bfia();
        int indexOf = this.f113496a.indexOf(str);
        if (indexOf >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "File not found.");
        bfdq bfdq = (bfdq) this.f113499d.get(indexOf);
        if (bfdq != bfdq.NOT_READ_YET) {
            int ordinal = bfdq.ordinal();
            if (ordinal == 1) {
                bfia.f113993c++;
            } else if (ordinal == 2) {
                bfia.f113991a++;
            } else if (ordinal == 3) {
                bfia.f113992b++;
            } else if (ordinal == 4) {
                bfia.f113994d++;
            }
            List<Boolean> list = (List) this.f113502g.get(str);
            if (list != null) {
                for (Boolean bool : list) {
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            bfia.f113995e++;
                        } else {
                            bfia.f113996f++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized bfia mo61476b() {
        bfia bfia;
        bfia = new bfia();
        List list = this.f113496a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                bfia a = mo61470a((String) list.get(i));
                if (a == null) {
                    bfia = null;
                    break;
                }
                bfia.f113991a += a.f113991a;
                bfia.f113992b += a.f113992b;
                bfia.f113993c += a.f113993c;
                bfia.f113994d += a.f113994d;
                bfia.f113995e += a.f113995e;
                bfia.f113996f += a.f113996f;
                i++;
            } else {
                break;
            }
        }
        return bfia;
    }

    /* renamed from: c */
    public final synchronized String mo61479c(int i) {
        String str;
        str = (String) this.f113503h.get(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder(76);
        sb.append("seqNum #");
        sb.append(i);
        sb.append(" not exist. addGLocRequest need to be called before this.");
        bmxy.m108582a(str, sb.toString());
        return str;
    }

    /* renamed from: c */
    public final synchronized void mo61481c(String str) {
        this.f113497b = str;
    }

    /* renamed from: b */
    public final synchronized String mo61477b(String str) {
        String valueOf;
        String valueOf2;
        valueOf = String.valueOf(this.f113498c.f113525c);
        valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: c */
    public final synchronized List mo61480c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry entry : this.f113501f.entrySet()) {
            List list = (List) this.f113502g.get(entry.getKey());
            if (list != null) {
                List list2 = (List) entry.getValue();
                for (int i = 0; i < list2.size(); i++) {
                    if (list.get(i) != null && ((Boolean) list.get(i)).booleanValue()) {
                        arrayList.add((Integer) list2.get(i));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized boolean mo61478b(int i) {
        return this.f113500e.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized List mo61471a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (int i = 0; i < this.f113499d.size(); i++) {
            if (this.f113499d.get(i) == bfdq.NOT_READ_YET) {
                this.f113499d.set(i, bfdq.READ_FAILURE);
                arrayList.add((String) this.f113496a.get(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo61472a(int i) {
        this.f113500e.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized void mo61473a(int i, boolean z) {
        boolean z2;
        Map map = this.f113503h;
        Integer valueOf = Integer.valueOf(i);
        String str = (String) map.get(valueOf);
        bmxy.m108582a(str, "Need to call corresponding addGLocRequest before calling this.");
        List list = (List) this.f113501f.get(str);
        List list2 = (List) this.f113502g.get(str);
        bmxy.m108582a(list, "Need to call corresponding addGLocRequest before calling this.");
        bmxy.m108582a(list2, "Need to call corresponding addGLocRequest before calling this.");
        boolean z3 = true;
        if (list.size() == list2.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108601b(z2, "Inconsistent state.");
        int indexOf = list.indexOf(valueOf);
        if (indexOf < 0) {
            z3 = false;
        }
        bmxy.m108601b(z3, "Need to call corresponding addGLocRequest before calling this.");
        list2.set(indexOf, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final synchronized void mo61474a(String str, int i) {
        if (!this.f113501f.containsKey(str)) {
            this.f113501f.put(str, new ArrayList());
            this.f113502g.put(str, new ArrayList());
        }
        List<Integer> list = (List) this.f113501f.get(str);
        List list2 = (List) this.f113502g.get(str);
        boolean z = false;
        for (Integer num : list) {
            if (num.intValue() == i) {
                z = true;
            }
        }
        if (!z) {
            list.add(Integer.valueOf(i));
            list2.add(null);
        }
        Map map = this.f113503h;
        Integer valueOf = Integer.valueOf(i);
        bmxy.m108601b(!map.containsKey(valueOf), "Duplicated seqNum (the same seqNum exists in more than one file)!");
        this.f113503h.put(valueOf, str);
    }

    /* renamed from: a */
    public final synchronized void mo61475a(String str, bfdq bfdq) {
        int indexOf = this.f113496a.indexOf(str);
        bmxy.m108601b(indexOf >= 0, String.valueOf(str).concat(" not in upload list."));
        this.f113499d.set(indexOf, bfdq);
    }
}
