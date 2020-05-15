package p000;

import com.google.android.gms.people.protomodel.Birthday;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.Email;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.Name;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.Person;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadata;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.Phone;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.Photo;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ancq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancq {
    /* renamed from: a */
    public static Person m64029a(bler bler) {
        PhoneEntity phoneEntity;
        char c;
        int i;
        EmailEntity emailEntity;
        char c2;
        int i2;
        PhotoEntity photoEntity;
        char c3;
        int i3;
        NameEntity nameEntity;
        char c4;
        int i4;
        BirthdayEntity birthdayEntity;
        char c5;
        int i5;
        bler bler2 = bler;
        if (bler2 == null) {
            return null;
        }
        amox amox = new amox();
        bxwc bxwc = bler2.f126261k;
        int size = bxwc.size();
        int i6 = 0;
        while (i6 < size) {
            bldi bldi = (bldi) bxwc.get(i6);
            Birthday[] birthdayArr = new Birthday[1];
            if (bldi != null) {
                amoo amoo = new amoo();
                amoo.f75635b = Long.valueOf(bldi.f126085c);
                bleu bleu = bldi.f126084b;
                if (bleu == null) {
                    bleu = bleu.f126278h;
                }
                PersonFieldMetadata a = m64030a(bleu);
                if (a == null) {
                    a = null;
                }
                amoo.f75634a = a;
                birthdayEntity = new BirthdayEntity(amoo.f75634a, amoo.f75635b, true);
            } else {
                birthdayEntity = null;
            }
            birthdayArr[0] = birthdayEntity;
            if (amox.f75649e == null) {
                amox.f75649e = new ArrayList();
                c5 = 0;
            } else {
                c5 = 0;
            }
            while (true) {
                i5 = i6 + 1;
                if (c5 > 0) {
                    break;
                }
                Birthday birthday = birthdayArr[0];
                if (birthday != null) {
                    List list = amox.f75649e;
                    birthday.mo7556bF();
                    list.add(birthday);
                }
                c5 = 1;
            }
            i6 = i5;
        }
        bxwc bxwc2 = bler2.f126254d;
        int size2 = bxwc2.size();
        int i7 = 0;
        while (i7 < size2) {
            bleh bleh = (bleh) bxwc2.get(i7);
            Name[] nameArr = new Name[1];
            if (bleh != null) {
                amov amov = new amov();
                amov.f75640b = bleh.f126203c;
                amov.f75642d = bleh.f126206f;
                amov.f75641c = bleh.f126205e;
                amov.f75643e = bleh.f126207g;
                amov.f75644f = bleh.f126214n;
                bleu bleu2 = bleh.f126202b;
                if (bleu2 == null) {
                    bleu2 = bleu.f126278h;
                }
                PersonFieldMetadata a2 = m64030a(bleu2);
                if (a2 == null) {
                    a2 = null;
                }
                amov.f75639a = a2;
                nameEntity = new NameEntity(amov.f75639a, amov.f75640b, null, amov.f75641c, amov.f75642d, amov.f75643e, amov.f75644f, true);
            } else {
                nameEntity = null;
            }
            nameArr[0] = nameEntity;
            if (amox.f75645a == null) {
                amox.f75645a = new ArrayList();
                c4 = 0;
            } else {
                c4 = 0;
            }
            while (true) {
                i4 = i7 + 1;
                if (c4 > 0) {
                    break;
                }
                Name name = nameArr[0];
                if (name != null) {
                    List list2 = amox.f75645a;
                    name.mo7556bF();
                    list2.add(name);
                }
                c4 = 1;
            }
            i7 = i4;
        }
        bxwc bxwc3 = bler2.f126255e;
        int size3 = bxwc3.size();
        int i8 = 0;
        while (i8 < size3) {
            bley bley = (bley) bxwc3.get(i8);
            Photo[] photoArr = new Photo[1];
            if (bley != null) {
                ampd ampd = new ampd();
                bleu bleu3 = bley.f126306b;
                if (bleu3 == null) {
                    bleu3 = bleu.f126278h;
                }
                PersonFieldMetadata a3 = m64030a(bleu3);
                if (a3 == null) {
                    a3 = null;
                }
                ampd.f75655a = a3;
                ampd.f75656b = bley.f126307c;
                photoEntity = new PhotoEntity(ampd.f75655a, ampd.f75656b, true);
            } else {
                photoEntity = null;
            }
            photoArr[0] = photoEntity;
            if (amox.f75646b == null) {
                amox.f75646b = new ArrayList();
                c3 = 0;
            } else {
                c3 = 0;
            }
            while (true) {
                i3 = i8 + 1;
                if (c3 > 0) {
                    break;
                }
                Photo photo = photoArr[0];
                if (photo != null) {
                    List list3 = amox.f75646b;
                    photo.mo7556bF();
                    list3.add(photo);
                }
                c3 = 1;
            }
            i8 = i3;
        }
        bxwc bxwc4 = bler2.f126257g;
        int size4 = bxwc4.size();
        int i9 = 0;
        while (i9 < size4) {
            bldu bldu = (bldu) bxwc4.get(i9);
            Email[] emailArr = new Email[1];
            if (bldu != null) {
                amor amor = new amor();
                amor.f75637b = bldu.f126135c;
                bleu bleu4 = bldu.f126134b;
                if (bleu4 == null) {
                    bleu4 = bleu.f126278h;
                }
                PersonFieldMetadata a4 = m64030a(bleu4);
                if (a4 == null) {
                    a4 = null;
                }
                amor.f75636a = a4;
                emailEntity = new EmailEntity(amor.f75636a, amor.f75637b, true);
            } else {
                emailEntity = null;
            }
            emailArr[0] = emailEntity;
            if (amox.f75647c == null) {
                amox.f75647c = new ArrayList();
                c2 = 0;
            } else {
                c2 = 0;
            }
            while (true) {
                i2 = i9 + 1;
                if (c2 > 0) {
                    break;
                }
                Email email = emailArr[0];
                if (email != null) {
                    List list4 = amox.f75647c;
                    email.mo7556bF();
                    list4.add(email);
                }
                c2 = 1;
            }
            i9 = i2;
        }
        bxwc bxwc5 = bler2.f126258h;
        int size5 = bxwc5.size();
        int i10 = 0;
        while (i10 < size5) {
            blex blex = (blex) bxwc5.get(i10);
            Phone[] phoneArr = new Phone[1];
            if (blex != null) {
                ampb ampb = new ampb();
                ampb.f75653b = blex.f126299c;
                ampb.f75654c = blex.f126300d;
                bleu bleu5 = blex.f126298b;
                if (bleu5 == null) {
                    bleu5 = bleu.f126278h;
                }
                PersonFieldMetadata a5 = m64030a(bleu5);
                if (a5 == null) {
                    a5 = null;
                }
                ampb.f75652a = a5;
                phoneEntity = new PhoneEntity(ampb.f75652a, ampb.f75653b, ampb.f75654c, true);
            } else {
                phoneEntity = null;
            }
            phoneArr[0] = phoneEntity;
            if (amox.f75648d == null) {
                amox.f75648d = new ArrayList();
                c = 0;
            } else {
                c = 0;
            }
            while (true) {
                i = i10 + 1;
                if (c > 0) {
                    break;
                }
                Phone phone = phoneArr[0];
                if (phone != null) {
                    List list5 = amox.f75648d;
                    phone.mo7556bF();
                    list5.add(phone);
                }
                c = 1;
            }
            i10 = i;
        }
        return new PersonEntity(null, amox.f75645a, amox.f75646b, amox.f75647c, amox.f75648d, amox.f75649e, true);
    }

    /* renamed from: a */
    private static PersonFieldMetadata m64030a(bleu bleu) {
        if (bleu == null) {
            return null;
        }
        amoz amoz = new amoz();
        int a = blet.m107088a(bleu.f126281b);
        if (a == 0) {
            a = 4;
        }
        Integer valueOf = Integer.valueOf(a - 1);
        boolean z = true;
        if (!(valueOf.intValue() == 3 || valueOf.intValue() == 0 || valueOf.intValue() == 1 || valueOf.intValue() == 2 || valueOf.intValue() == 4 || valueOf.intValue() == 5 || valueOf.intValue() == 6 || valueOf.intValue() == 7 || valueOf.intValue() == 8 || valueOf.intValue() == 9 || valueOf.intValue() == 10 || valueOf.intValue() == 11 || valueOf.intValue() == 13 || valueOf.intValue() == 14 || valueOf.intValue() == 15 || valueOf.intValue() == 16)) {
            z = false;
        }
        sdo.m34975b(z, "Invalid constant for Container. Use value in ModelConstants");
        amoz.f75650a = valueOf;
        amoz.f75651b = Boolean.valueOf(bleu.f126284e);
        return new PersonFieldMetadataEntity(amoz.f75650a, amoz.f75651b);
    }
}
