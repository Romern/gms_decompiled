package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.AvatarReference;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: alxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alxn extends alln implements alwi {

    /* renamed from: a */
    public final alvp f74529a;

    /* renamed from: b */
    public final Set f74530b = new HashSet();

    /* renamed from: c */
    public amaz f74531c;

    /* renamed from: m */
    public Status f74532m;

    /* renamed from: n */
    public boolean f74533n = false;

    /* renamed from: o */
    public Bundle f74534o;

    /* renamed from: p */
    public boolean f74535p = false;

    /* renamed from: q */
    private final WeakReference f74536q;

    /* renamed from: r */
    private Context f74537r;

    /* renamed from: s */
    private Status f74538s;

    /* renamed from: t */
    private alvq[] f74539t;

    /* renamed from: u */
    private rlf f74540u;

    /* renamed from: v */
    private final alxb f74541v;

    public alxn(rkb rkb, alvp alvp, alxb alxb) {
        super(rkb);
        this.f74536q = new WeakReference(rkb);
        this.f74529a = alvp;
        this.f74541v = alxb;
        this.f74540u = this;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0215  */
    /* renamed from: d */
    public final String[] mo23598d() {
        Status status;
        boolean z;
        alxi alxi;
        rlf rlf;
        ArrayList arrayList;
        List list;
        alxa alxa;
        int i;
        rlf rlf2;
        Person.Names names;
        String str;
        Person.Images images;
        AvatarReference avatarReference;
        Iterator it;
        rlf rlf3;
        if (this.f74540u == null) {
            return null;
        }
        alvp alvp = this.f74529a;
        if (alvp.f74405d && this.f74538s == null) {
            status = new Status(100);
        } else if (alvp.f74404c || alvp.f74403b) {
            status = !this.f74533n ? new Status(100) : this.f74532m;
        } else {
            status = Status.f30107a;
        }
        int i2 = 0;
        if (status.f30115i != 100) {
            z = true;
        } else {
            z = false;
        }
        rlf rlf4 = this.f74540u;
        rkb rkb = (rkb) this.f74536q.get();
        if (z) {
            alxi = null;
        } else if (rkb != null) {
            alxi = new alxi(allr.f73629a, rkb);
            if (rkb.mo24805i()) {
                rkb.mo24795b(alxi);
            }
        } else {
            alxi = null;
        }
        this.f74540u = alxi;
        alxb alxb = this.f74541v;
        alwb a = alwb.m61992a(this.f74534o);
        alvq[] alvqArr = this.f74539t;
        if (a != null) {
            ArrayList arrayList2 = new ArrayList();
            if (a.f74439a != null) {
                try {
                    alxy alxy = new alxy();
                    alxy.mo25615b(a.f74439a);
                    Iterator it2 = alxy.f74544b.iterator();
                    while (it2.hasNext()) {
                        Person person = (Person) it2.next();
                        List list2 = person.f83176y;
                        if (list2 != null && !list2.isEmpty()) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    names = (Person.Names) list2.get(i2);
                                    break;
                                }
                                names = (Person.Names) it3.next();
                                Mergedpeoplemetadata mergedpeoplemetadata = names.f83347h;
                                if (mergedpeoplemetadata != null && mergedpeoplemetadata.f83125j) {
                                    break;
                                }
                            }
                        } else {
                            names = null;
                        }
                        if (names != null) {
                            str = names.f83341b;
                        } else {
                            str = null;
                        }
                        List list3 = person.f83168q;
                        if (list3 != null && !list3.isEmpty()) {
                            Iterator it4 = list3.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    images = (Person.Images) list3.get(i2);
                                    break;
                                }
                                images = (Person.Images) it4.next();
                                Mergedpeoplemetadata mergedpeoplemetadata2 = images.f83275c;
                                if (mergedpeoplemetadata2 != null && mergedpeoplemetadata2.f83125j) {
                                    break;
                                }
                            }
                        } else {
                            images = null;
                        }
                        if (images == null || TextUtils.isEmpty(images.f83277e)) {
                            avatarReference = null;
                        } else {
                            avatarReference = new AvatarReference(1, images.f83277e);
                        }
                        String f = ancm.m64017f(person.f83167p);
                        String str2 = person.f83167p;
                        if (str2 == null || str2.length() != 21) {
                            str2 = null;
                        }
                        if (str2 == null) {
                            it = it2;
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= str2.length()) {
                                    it = it2;
                                    break;
                                }
                                it = it2;
                                if (str2.charAt(i3) < '0' || str2.charAt(i3) > '9') {
                                    str2 = null;
                                } else {
                                    i3++;
                                    it2 = it;
                                }
                            }
                            str2 = null;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (str2 != null) {
                            arrayList3.add(new ContactPerson.ContactMethod(0, str2));
                        }
                        List list4 = person.f83161j;
                        if (list4 != null) {
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                Iterator it6 = it5;
                                rlf = rlf2;
                                try {
                                    ContactPerson.ContactMethod contactMethod = new ContactPerson.ContactMethod(1, ((Person.Emails) it5.next()).f83234f);
                                    if (!arrayList3.contains(contactMethod)) {
                                        arrayList3.add(contactMethod);
                                        it5 = it6;
                                        rlf2 = rlf;
                                    } else {
                                        it5 = it6;
                                        rlf2 = rlf;
                                    }
                                } catch (siy e) {
                                    e = e;
                                    Log.w("IdentityLoader", "ParseException", e);
                                    arrayList = arrayList2;
                                    if (alvqArr != null) {
                                    }
                                    alxa = new alxa(arrayList, list);
                                    HashSet hashSet = new HashSet();
                                    while (i < alxa.mo40836a()) {
                                    }
                                    rlf.mo9482a(new alxk(status, new alxj(this, alxa, alxi), z, alxi));
                                    return (String[]) hashSet.toArray(new String[hashSet.size()]);
                                }
                            }
                            rlf3 = rlf2;
                        } else {
                            rlf3 = rlf2;
                        }
                        List<Person.PhoneNumbers> list5 = person.f83143D;
                        if (list5 != null) {
                            for (Person.PhoneNumbers phoneNumbers : list5) {
                                ContactPerson.ContactMethod contactMethod2 = new ContactPerson.ContactMethod(2, phoneNumbers.f83389f);
                                if (!arrayList3.contains(contactMethod2)) {
                                    arrayList3.add(contactMethod2);
                                }
                            }
                        }
                        alxb.f74488a.mo11502a(arrayList3);
                        if (arrayList3.size() > 0) {
                            arrayList2.add(new fyb(f, new ContactPerson(str, str2, avatarReference, arrayList3)));
                            it2 = it;
                            rlf4 = rlf3;
                            i2 = 0;
                        } else {
                            it2 = it;
                            rlf4 = rlf3;
                            i2 = 0;
                        }
                    }
                    rlf = rlf2;
                    arrayList = arrayList2;
                } catch (siy e2) {
                    e = e2;
                    rlf = rlf4;
                    Log.w("IdentityLoader", "ParseException", e);
                    arrayList = arrayList2;
                    if (alvqArr != null) {
                    }
                    alxa = new alxa(arrayList, list);
                    HashSet hashSet2 = new HashSet();
                    while (i < alxa.mo40836a()) {
                    }
                    rlf.mo9482a(new alxk(status, new alxj(this, alxa, alxi), z, alxi));
                    return (String[]) hashSet2.toArray(new String[hashSet2.size()]);
                }
            } else {
                rlf = rlf4;
                arrayList = arrayList2;
            }
        } else {
            rlf = rlf4;
            arrayList = Collections.emptyList();
        }
        if (alvqArr != null) {
            list = new ArrayList();
        } else {
            list = Collections.emptyList();
        }
        alxa = new alxa(arrayList, list);
        HashSet hashSet22 = new HashSet();
        for (i = 0; i < alxa.mo40836a(); i++) {
            String str3 = ((fyb) alxa.mo40837a(i)).f17587b;
            if (str3 != null) {
                hashSet22.add(str3);
            }
        }
        rlf.mo9482a(new alxk(status, new alxj(this, alxa, alxi), z, alxi));
        return (String[]) hashSet22.toArray(new String[hashSet22.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return alxo.m62097b(status);
    }

    /* renamed from: a */
    public final void mo40833a(Status status, alvq[] alvqArr) {
        try {
            this.f74538s = status;
            this.f74539t = alvqArr;
            mo23598d();
        } catch (Exception e) {
            Log.w("PeopleClient", "GetById CP2 callback error.", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo40841a(DataHolder dataHolder) {
        HashSet hashSet = new HashSet();
        if (dataHolder != null) {
            for (int i = 0; i < dataHolder.f30168h; i++) {
                hashSet.add(alwy.m62044g(dataHolder.mo17769c("contact_id", i, dataHolder.mo17762a(i))));
            }
        }
        new Thread(new alwm(this, this.f74537r, this.f74529a.f74402a.f74385a, hashSet)).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        amaz amaz = (amaz) rjd;
        this.f74531c = amaz;
        this.f74537r = amaz.f74602c;
        alvp alvp = this.f74529a;
        if (alvp.f74402a.f74385a == null || (!alvp.f74404c && !alvp.f74403b)) {
            this.f74533n = true;
            if (alvp.f74403b || alvp.f74404c) {
                this.f74532m = Status.f30109c;
            } else {
                this.f74532m = Status.f30107a;
            }
            mo40841a((DataHolder) null);
            return;
        }
        amaz.mo41080a(new alxm(this), this.f74529a);
    }
}
