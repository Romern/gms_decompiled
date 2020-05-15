package p000;

import android.content.Context;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aexg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexg extends aesx {

    /* renamed from: b */
    private final ContactPerson f63976b;

    public aexg(Context context, String str, ContactPerson contactPerson) {
        super(context, str);
        this.f63976b = contactPerson;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r5v0, assign insn: 0x0015: CONST  (r5v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int], assign insn: PHI: (r5v1 ?) = (r5v0 ?), (r5v15 ?) binds: [B:8:0x002b, B:95:0x01fa] */
    /* JADX WARN: Type inference failed for: r5v15, assign insn: ?: MOVE  (r5v15 ?) = (r5v3 boolean) */
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i;
        boolean z;
        bznc bznc;
        bxvd bxvd;
        boolean z2;
        String str = ((aesx) this).f63753a;
        Context context = getContext();
        ContactPerson contactPerson = this.f63976b;
        aexh aexh = new aexh(str, context);
        ArrayList arrayList = contactPerson.f9753e;
        int size = arrayList.size();
        ? r5 = 0;
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= size) {
                z = false;
                break;
            }
            int i3 = i2 + 1;
            if (((ContactPerson.ContactMethod) arrayList.get(i2)).f9755a == 0) {
                z = true;
                break;
            }
            i2 = i3;
        }
        bxvd da = bznb.f170693b.mo74144da();
        ArrayList arrayList2 = contactPerson.f9753e;
        ContactPerson.ContactMethod a = contactPerson.mo7263a();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            bzly bzly = null;
            if (i4 >= size2) {
                break;
            }
            ContactPerson.ContactMethod contactMethod = (ContactPerson.ContactMethod) arrayList2.get(i4);
            int i5 = contactMethod.f9755a;
            if (i5 == i || i5 == 2) {
                bxvd da2 = bzly.f170589d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = r5;
                }
                bzly bzly2 = (bzly) da2.f164949b;
                bzly2.f170593c = i;
                bzly2.f170591a |= 2;
                bxvd da3 = bzlr.f170559j.mo74144da();
                int i6 = contactMethod.f9755a;
                if (i6 == i) {
                    String str2 = contactMethod.f9756b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzlr bzlr = (bzlr) da3.f164949b;
                    str2.getClass();
                    bxvd = da;
                    bzlr.f170561a |= 2;
                    bzlr.f170563c = str2;
                } else if (i6 != 2) {
                    bxvd = da;
                } else {
                    String str3 = contactMethod.f9756b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzlr bzlr2 = (bzlr) da3.f164949b;
                    str3.getClass();
                    bzlr2.f170561a |= 4;
                    bzlr2.f170564d = str3;
                    bxvd = da;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzly bzly3 = (bzly) da2.f164949b;
                bzlr bzlr3 = (bzlr) da3.mo74062i();
                bzlr3.getClass();
                bzly3.f170592b = bzlr3;
                i = 1;
                bzly3.f170591a |= 1;
                bzly = (bzly) da2.mo74062i();
            } else {
                bxvd = da;
            }
            if (bzly == null) {
                z2 = false;
            } else if (contactMethod.equals(a)) {
                z2 = false;
                arrayList3.add(0, bzly);
            } else {
                z2 = false;
                arrayList3.add(bzly);
            }
            i4++;
            da = bxvd;
            r5 = z2;
        }
        List asList = Arrays.asList((bzly[]) arrayList3.toArray(new bzly[arrayList3.size()]));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = r5;
        }
        bznb bznb = (bznb) da.f164949b;
        if (!bznb.f170695a.mo73666a()) {
            bznb.f170695a = GeneratedMessageLite.m124021a(bznb.f170695a);
        }
        bxsy.m123078a(asList, bznb.f170695a);
        try {
            bznc = (bznc) aexh.mo34565a((bznb) da.mo74062i(), bznc.f170696b, "resolvecontacts");
        } catch (Exception e) {
            bnsl bnsl = (bnsl) aexh.f63977a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Exception in resolveContact");
            bznc = null;
        }
        if (bznc != null && bznc.f170698a.size() > 0) {
            bxwc bxwc = bznc.f170698a;
            int size3 = bxwc.size();
            int i7 = 0;
            while (true) {
                if (i7 < size3) {
                    bzlx bzlx = (bzlx) bxwc.get(i7);
                    bzly bzly4 = bzlx.f170583b;
                    if (bzly4 == null) {
                        bzly4 = bzly.f170589d;
                    }
                    bzlr bzlr4 = bzly4.f170592b;
                    if (bzlr4 == null) {
                        bzlr4 = bzlr.f170559j;
                    }
                    if (bzlr4.f170562b.isEmpty()) {
                        i7++;
                        if (z) {
                            break;
                        }
                    } else {
                        bzly bzly5 = bzlx.f170583b;
                        if (bzly5 == null) {
                            bzly5 = bzly.f170589d;
                        }
                        bzlr bzlr5 = bzly5.f170592b;
                        if (bzlr5 == null) {
                            bzlr5 = bzlr.f170559j;
                        }
                        String str4 = bzlr5.f170562b;
                        bzly bzly6 = bzlx.f170583b;
                        if (bzly6 == null) {
                            bzly6 = bzly.f170589d;
                        }
                        bzlr bzlr6 = bzly6.f170592b;
                        if (bzlr6 == null) {
                            bzlr6 = bzlr.f170559j;
                        }
                        if (!bzlr6.f170562b.isEmpty()) {
                            contactPerson.f9750b = str4;
                            if (!bzlx.f170584c.isEmpty()) {
                                ArrayList arrayList4 = contactPerson.f9753e;
                                int size4 = arrayList4.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size4) {
                                        contactPerson.f9749a = bzlx.f170584c;
                                        break;
                                    }
                                    int i9 = i8 + 1;
                                    if (((ContactPerson.ContactMethod) arrayList4.get(i8)).f9756b.equals(bzlx.f170584c)) {
                                        break;
                                    }
                                    i8 = i9;
                                }
                            }
                            ContactPerson.ContactMethod contactMethod2 = new ContactPerson.ContactMethod(r5, str4);
                            ContactPerson.ContactMethod[] contactMethodArr = new ContactPerson.ContactMethod[i];
                            contactMethodArr[r5] = contactMethod2;
                            contactPerson.mo7265a(bnkn.m109665a(contactMethodArr));
                            contactPerson.mo7264a(contactMethod2);
                            if ((bzlx.f170582a & 4) != 0) {
                                contactPerson.f9752d = new AvatarReference(5, bzlx.f170585d);
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (bznc != null || z) {
            return contactPerson;
        }
        return null;
    }
}
