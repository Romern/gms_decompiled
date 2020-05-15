package p000;

import android.content.ContentUris;
import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.identity.internal.models.ImageReferenceImpl;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import com.google.android.gms.smart_profile.SmartProfilePerson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: alxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alxf implements rtp {

    /* renamed from: a */
    final /* synthetic */ rle f74491a;

    /* renamed from: b */
    final /* synthetic */ alxh f74492b;

    public alxf(alxh alxh, rle rle) {
        this.f74492b = alxh;
        this.f74491a = rle;
    }

    /* renamed from: a */
    public final int mo24660a() {
        return this.f74492b.f74504b.length;
    }

    /* renamed from: b */
    public final Bundle mo24662b() {
        return null;
    }

    /* renamed from: c */
    public final void mo12460c() {
        rle rle = this.f74491a;
        if (rle != null) {
            rle.mo9460b();
        }
        for (DataHolder dataHolder : this.f74492b.f74505c) {
            dataHolder.close();
        }
    }

    public final void close() {
        mo12460c();
    }

    public final Iterator iterator() {
        return new rtq(this);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[Catch:{ siy -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba A[Catch:{ siy -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x025a  */
    /* renamed from: a */
    public final Object mo24661a(int i) {
        alwb alwb;
        alvq alvq;
        alvx alvx;
        SmartProfilePerson smartProfilePerson;
        char c;
        String str;
        PersonImpl.PersonMetadataImpl personMetadataImpl;
        String str2;
        int i2;
        int i3 = i;
        ArrayList arrayList = this.f74492b.f74507n;
        if (arrayList != null) {
            alwb = alwb.m61992a((Bundle) arrayList.get(i3));
        } else {
            alwb = null;
        }
        alxh alxh = this.f74492b;
        alvq[] alvqArr = alxh.f74517x;
        if (alvqArr != null) {
            alvq = alvqArr[i3];
        } else {
            alvq = null;
        }
        DataHolder dataHolder = alxh.f74508o;
        if (dataHolder != null) {
            DataHolder dataHolder2 = alxh.f74509p;
            DataHolder dataHolder3 = alxh.f74510q;
            DataHolder dataHolder4 = alxh.f74511r;
            DataHolder dataHolder5 = alxh.f74512s;
            DataHolder dataHolder6 = alxh.f74513t;
            DataHolder dataHolder7 = alxh.f74514u;
            DataHolder dataHolder8 = alxh.f74515v;
            DataHolder dataHolder9 = alxh.f74516w;
            alvw alvw = (alvw) alvx.m61958a(alvx.m61959a(dataHolder, i3));
            if (alvw != null) {
                alvx = new alvz(alvw, dataHolder2, dataHolder3, dataHolder4, dataHolder9, i);
            } else {
                alvw alvw2 = (alvw) alvx.m61958a(alvx.m61959a(dataHolder5, i3));
                if (alvw2 != null) {
                    alvx = new alvy(alvw2, dataHolder6, dataHolder7, dataHolder8, i);
                }
            }
            alxh alxh2 = this.f74492b;
            Context context = alxh2.f74506m;
            Object obj = alxh2.f74504b[i3];
            SmartProfilePerson smartProfilePerson2 = new SmartProfilePerson();
            if (!(alwb == null || alwb.f74439a == null)) {
                i2 = alwb.f74440b;
                if (i2 != 2) {
                    Person person = new Person();
                    person.mo25615b(alwb.f74439a);
                    alxx.m62101a(person, smartProfilePerson2);
                } else if (i2 != 4) {
                    Log.w("DefaultPersonFactory", "Unrecognized data format");
                    smartProfilePerson = null;
                    if (alvq != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (alwa alwa : alvq.f74406a) {
                            alvr alvr = alwa.f74435f;
                            if (alvr != null) {
                                arrayList2.add(new alvr(alvr.f74407a, alvr.f74408b, alvr.f74409c, alvr.f74410d, alvr.f74411e, alvr.f74412f, alvr.f74413g, alvr.f74414h));
                            }
                        }
                        smartProfilePerson.f107754J = arrayList2;
                    }
                    return smartProfilePerson;
                } else {
                    alxy alxy = new alxy();
                    alxy.mo25615b(alwb.f74439a);
                    if (alxy.f74543a.contains(2) && alxy.f74544b.size() > 0) {
                        alxx.m62101a((Person) alxy.f74544b.get(0), smartProfilePerson2);
                    }
                }
                if (alvq != null) {
                    HashSet hashSet = new HashSet();
                    for (alwa alwa2 : alvq.f74406a) {
                        if (!TextUtils.isEmpty(alwa2.mo40830a(0)) || !TextUtils.isEmpty(alwa2.mo40830a(13))) {
                            if (!hashSet.contains(alwa2.f74430a)) {
                                hashSet.add(alwa2.f74430a);
                                PersonImpl.MembershipsImpl membershipsImpl = new PersonImpl.MembershipsImpl();
                                membershipsImpl.f81822d = alwa2.f74430a;
                                membershipsImpl.f81820b = alwz.m62046a(alwa2);
                                smartProfilePerson2.mo46284a(membershipsImpl);
                            }
                            String str3 = alwa2.f74432c;
                            switch (str3.hashCode()) {
                                case -1569536764:
                                    if (str3.equals("vnd.android.cursor.item/email_v2")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1328682538:
                                    if (str3.equals("vnd.android.cursor.item/contact_event")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1079224304:
                                    if (str3.equals("vnd.android.cursor.item/name")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1079210633:
                                    if (str3.equals("vnd.android.cursor.item/note")) {
                                        c = 11;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -601229436:
                                    if (str3.equals("vnd.android.cursor.item/postal-address_v2")) {
                                        c = 8;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 456415478:
                                    if (str3.equals("vnd.android.cursor.item/website")) {
                                        c = 9;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 684173810:
                                    if (str3.equals("vnd.android.cursor.item/phone_v2")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 689862072:
                                    if (str3.equals("vnd.android.cursor.item/organization")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 905843021:
                                    if (str3.equals("vnd.android.cursor.item/photo")) {
                                        c = 10;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 950831081:
                                    if (str3.equals("vnd.android.cursor.item/im")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1409846529:
                                    if (str3.equals("vnd.android.cursor.item/relation")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2034973555:
                                    if (str3.equals("vnd.android.cursor.item/nickname")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    PersonImpl.EmailsImpl emailsImpl = new PersonImpl.EmailsImpl();
                                    emailsImpl.f81792b = alwz.m62046a(alwa2);
                                    emailsImpl.f81795e = alwq.m62008a(alwa2);
                                    emailsImpl.f81794d = alwq.m62010b(alwa2);
                                    emailsImpl.f81793c = alwq.m62009a(context, alwa2);
                                    emailsImpl.mo46307a(alwa2.f74436g);
                                    smartProfilePerson2.mo46279a(emailsImpl);
                                    continue;
                                case 1:
                                    PersonImpl.EventsImpl eventsImpl = new PersonImpl.EventsImpl();
                                    eventsImpl.f81798b = alwz.m62046a(alwa2);
                                    eventsImpl.f81801e = alwr.m62011a(alwa2);
                                    eventsImpl.f81800d = alwr.m62012a(context, alwa2);
                                    eventsImpl.f81799c = alwr.m62013b(alwa2);
                                    smartProfilePerson2.mo46280a(eventsImpl);
                                    continue;
                                case 2:
                                    PersonImpl.InstantMessagingImpl instantMessagingImpl = new PersonImpl.InstantMessagingImpl();
                                    instantMessagingImpl.f81811b = alwz.m62046a(alwa2);
                                    instantMessagingImpl.f81816g = alws.m62014a(alwa2);
                                    instantMessagingImpl.f81815f = alws.m62016b(alwa2);
                                    instantMessagingImpl.f81813d = alws.m62015a(context, alwa2);
                                    instantMessagingImpl.f81814e = alws.m62018c(alwa2);
                                    instantMessagingImpl.f81812c = alws.m62017b(context, alwa2);
                                    smartProfilePerson2.mo46283a(instantMessagingImpl);
                                    continue;
                                case 3:
                                    PersonImpl.NicknamesImpl nicknamesImpl = new PersonImpl.NicknamesImpl();
                                    nicknamesImpl.f81848b = alwz.m62046a(alwa2);
                                    nicknamesImpl.f81850d = alwt.m62019a(alwa2);
                                    nicknamesImpl.f81849c = alwt.m62020b(alwa2);
                                    smartProfilePerson2.mo46286a(nicknamesImpl);
                                    continue;
                                case 4:
                                    PersonImpl.OrganizationsImpl organizationsImpl = new PersonImpl.OrganizationsImpl();
                                    organizationsImpl.f81858b = alwz.m62046a(alwa2);
                                    organizationsImpl.f81865i = alwu.m62021a(alwa2);
                                    organizationsImpl.f81870n = alwu.m62022b(alwa2);
                                    organizationsImpl.f81869m = alwu.m62023c(alwa2);
                                    organizationsImpl.f81860d = alwu.m62024d(alwa2);
                                    organizationsImpl.f81861e = alwu.m62025e(alwa2);
                                    organizationsImpl.f81868l = alwu.m62026f(alwa2);
                                    organizationsImpl.f81866j = alwu.m62027g(alwa2);
                                    organizationsImpl.f81864h = alwu.m62028h(alwa2);
                                    smartProfilePerson2.mo46289a(organizationsImpl);
                                    continue;
                                case 5:
                                    PersonImpl.PhoneNumbersImpl phoneNumbersImpl = new PersonImpl.PhoneNumbersImpl();
                                    phoneNumbersImpl.f81887b = alwz.m62046a(alwa2);
                                    phoneNumbersImpl.f81891f = alwv.m62029a(alwa2);
                                    phoneNumbersImpl.f81890e = alwv.m62031b(alwa2);
                                    phoneNumbersImpl.f81889d = alwv.m62030a(context, alwa2);
                                    phoneNumbersImpl.mo46340a(alwa2.f74436g);
                                    smartProfilePerson2.mo46290a(phoneNumbersImpl);
                                    continue;
                                case 6:
                                    PersonImpl.RelationsImpl relationsImpl = new PersonImpl.RelationsImpl();
                                    relationsImpl.f81901b = alwz.m62046a(alwa2);
                                    relationsImpl.f81904e = alww.m62032a(alwa2);
                                    relationsImpl.f81903d = alww.m62034b(alwa2);
                                    relationsImpl.f81902c = alww.m62033a(context, alwa2);
                                    smartProfilePerson2.mo46292a(relationsImpl);
                                    continue;
                                case 7:
                                    PersonImpl.NamesImpl namesImpl = new PersonImpl.NamesImpl();
                                    namesImpl.f81835b = alwz.m62046a(alwa2);
                                    namesImpl.f81836c = alwa2.mo40830a(0);
                                    namesImpl.f81839f = alwa2.mo40830a(1);
                                    namesImpl.f81837d = alwa2.mo40830a(2);
                                    namesImpl.f81840g = alwa2.mo40830a(3);
                                    namesImpl.f81842i = alwa2.mo40830a(4);
                                    namesImpl.f81841h = alwa2.mo40830a(5);
                                    namesImpl.f81844k = alwa2.mo40830a(6);
                                    namesImpl.f81843j = alwa2.mo40830a(8);
                                    smartProfilePerson2.mo46285a(namesImpl);
                                    continue;
                                case 8:
                                    PersonImpl.AddressesImpl addressesImpl = new PersonImpl.AddressesImpl();
                                    addressesImpl.f81765b = alwz.m62046a(alwa2);
                                    addressesImpl.f81774k = alwp.m61999a(alwa2);
                                    addressesImpl.f81769f = alwp.m62000a(context, alwa2);
                                    addressesImpl.f81773j = alwp.m62001b(alwa2);
                                    addressesImpl.f81770g = alwp.m62002c(alwa2);
                                    addressesImpl.f81766c = alwp.m62003d(alwa2);
                                    addressesImpl.f81772i = alwp.m62004e(alwa2);
                                    addressesImpl.f81771h = alwp.m62005f(alwa2);
                                    addressesImpl.f81767d = alwp.m62006g(alwa2);
                                    addressesImpl.f81768e = alwp.m62007h(alwa2);
                                    smartProfilePerson2.mo46274a(addressesImpl);
                                    continue;
                                case 9:
                                    PersonImpl.UrlsImpl urlsImpl = new PersonImpl.UrlsImpl();
                                    urlsImpl.f81922b = alwz.m62046a(alwa2);
                                    urlsImpl.f81925e = alwx.m62035a(alwa2);
                                    urlsImpl.f81924d = alwx.m62036b(alwa2);
                                    smartProfilePerson2.mo46295a(urlsImpl);
                                    continue;
                                case 10:
                                    if (!TextUtils.isEmpty(alwa2.mo40830a(13))) {
                                        PersonImpl.ImagesImpl imagesImpl = new PersonImpl.ImagesImpl();
                                        imagesImpl.f81807b = alwz.m62046a(alwa2);
                                        ImageReferenceImpl imageReferenceImpl = new ImageReferenceImpl();
                                        String a = alwa2.mo40830a(13);
                                        if (a != null) {
                                            try {
                                                str = ContentUris.withAppendedId(ContactsContract.DisplayPhoto.CONTENT_URI, Long.parseLong(a)).toString();
                                            } catch (NumberFormatException e) {
                                                str = null;
                                            }
                                        } else {
                                            str = null;
                                        }
                                        imageReferenceImpl.f81723c = str;
                                        imageReferenceImpl.mo46271a(2);
                                        imagesImpl.f81808c = imageReferenceImpl;
                                        smartProfilePerson2.mo46282a(imagesImpl);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 11:
                                    PersonImpl.NotesImpl notesImpl = new PersonImpl.NotesImpl();
                                    notesImpl.f81852b = alwz.m62046a(alwa2);
                                    notesImpl.f81853c = alwa2.mo40830a(0);
                                    smartProfilePerson2.mo46287a(notesImpl);
                                    continue;
                            }
                        }
                    }
                }
                smartProfilePerson = smartProfilePerson2;
                if (alvq != null) {
                }
                return smartProfilePerson;
            }
            if (alvx != null) {
                if (!smartProfilePerson2.mo40997J()) {
                    personMetadataImpl = new PersonImpl.PersonMetadataImpl();
                    smartProfilePerson2.f81753t = personMetadataImpl;
                } else {
                    personMetadataImpl = smartProfilePerson2.f81753t;
                }
                int e2 = alvx.mo40824e();
                if (e2 != 1) {
                    if (e2 == 2) {
                        str2 = "page";
                    }
                    if (alvx.mo40826g() != null) {
                        for (alvt alvt : alvx.mo40826g()) {
                            personMetadataImpl.mo46328a().add(alvt.mo40815a());
                            PersonImpl.MembershipsImpl membershipsImpl2 = new PersonImpl.MembershipsImpl();
                            membershipsImpl2.f81821c = alvt.mo40815a();
                            PersonImpl.MetadataImpl metadataImpl = new PersonImpl.MetadataImpl();
                            metadataImpl.f81825b = "profile";
                            metadataImpl.f81827d = alvx.mo40821b();
                            membershipsImpl2.f81820b = metadataImpl;
                            smartProfilePerson2.mo46284a(membershipsImpl2);
                        }
                    }
                    PersonImpl.NamesImpl namesImpl2 = new PersonImpl.NamesImpl();
                    namesImpl2.f81836c = alvx.mo40819a();
                    PersonImpl.MetadataImpl metadataImpl2 = new PersonImpl.MetadataImpl();
                    metadataImpl2.f81825b = "profile";
                    metadataImpl2.mo46318a(true);
                    metadataImpl2.mo46320c(false);
                    metadataImpl2.mo46319b(alvx.mo40822c());
                    namesImpl2.f81835b = metadataImpl2;
                    smartProfilePerson2.mo46285a(namesImpl2);
                    smartProfilePerson2.f81746m = alvx.mo40821b();
                    PersonImpl.TaglinesImpl taglinesImpl = new PersonImpl.TaglinesImpl();
                    taglinesImpl.f81920c = alvx.mo40823d();
                    PersonImpl.MetadataImpl metadataImpl3 = new PersonImpl.MetadataImpl();
                    metadataImpl3.f81825b = "profile";
                    metadataImpl3.mo46318a(true);
                    metadataImpl3.mo46320c(false);
                    taglinesImpl.f81919b = metadataImpl3;
                    smartProfilePerson2.mo46294a(taglinesImpl);
                    PersonImpl.ImagesImpl imagesImpl2 = new PersonImpl.ImagesImpl();
                    ImageReferenceImpl imageReferenceImpl2 = new ImageReferenceImpl();
                    imageReferenceImpl2.f81723c = alvx.mo40825f();
                    imageReferenceImpl2.mo46271a(1);
                    imagesImpl2.f81808c = imageReferenceImpl2;
                    imagesImpl2.mo46311a(true);
                    PersonImpl.MetadataImpl metadataImpl4 = new PersonImpl.MetadataImpl();
                    metadataImpl4.f81825b = "profile";
                    metadataImpl4.mo46318a(true);
                    metadataImpl4.mo46320c(false);
                    imagesImpl2.f81807b = metadataImpl4;
                    smartProfilePerson2.mo46282a(imagesImpl2);
                    if (alvx.mo40827h() != null) {
                        for (alvs alvs : alvx.mo40827h()) {
                            PersonImpl.AddressesImpl addressesImpl2 = new PersonImpl.AddressesImpl();
                            addressesImpl2.f81773j = alvs.f74415a;
                            addressesImpl2.f81769f = alvs.f74416b;
                            PersonImpl.MetadataImpl metadataImpl5 = new PersonImpl.MetadataImpl();
                            metadataImpl5.f81825b = "profile";
                            metadataImpl5.mo46318a(true);
                            metadataImpl5.mo46320c(false);
                            addressesImpl2.f81765b = metadataImpl5;
                            smartProfilePerson2.mo46274a(addressesImpl2);
                        }
                    }
                    if (alvx.mo40828i() != null) {
                        for (alvv alvv : alvx.mo40828i()) {
                            PersonImpl.PhoneNumbersImpl phoneNumbersImpl2 = new PersonImpl.PhoneNumbersImpl();
                            phoneNumbersImpl2.f81891f = alvv.f74420a;
                            phoneNumbersImpl2.f81889d = alvv.f74421b;
                            PersonImpl.MetadataImpl metadataImpl6 = new PersonImpl.MetadataImpl();
                            metadataImpl6.f81825b = "profile";
                            metadataImpl6.mo46318a(true);
                            metadataImpl6.mo46320c(false);
                            phoneNumbersImpl2.f81887b = metadataImpl6;
                            smartProfilePerson2.mo46290a(phoneNumbersImpl2);
                        }
                    }
                    if (alvx.mo40829j() != null) {
                        for (alvu alvu : alvx.mo40829j()) {
                            PersonImpl.EmailsImpl emailsImpl2 = new PersonImpl.EmailsImpl();
                            emailsImpl2.f81795e = alvu.f74418a;
                            emailsImpl2.f81793c = alvu.f74419b;
                            PersonImpl.MetadataImpl metadataImpl7 = new PersonImpl.MetadataImpl();
                            metadataImpl7.f81825b = "profile";
                            metadataImpl7.mo46318a(true);
                            metadataImpl7.mo46320c(false);
                            emailsImpl2.f81792b = metadataImpl7;
                            smartProfilePerson2.mo46279a(emailsImpl2);
                        }
                    }
                } else {
                    str2 = "person";
                }
                personMetadataImpl.f81878h = str2;
                if (alvx.mo40826g() != null) {
                }
                PersonImpl.NamesImpl namesImpl22 = new PersonImpl.NamesImpl();
                namesImpl22.f81836c = alvx.mo40819a();
                PersonImpl.MetadataImpl metadataImpl22 = new PersonImpl.MetadataImpl();
                metadataImpl22.f81825b = "profile";
                metadataImpl22.mo46318a(true);
                metadataImpl22.mo46320c(false);
                metadataImpl22.mo46319b(alvx.mo40822c());
                namesImpl22.f81835b = metadataImpl22;
                smartProfilePerson2.mo46285a(namesImpl22);
                smartProfilePerson2.f81746m = alvx.mo40821b();
                PersonImpl.TaglinesImpl taglinesImpl2 = new PersonImpl.TaglinesImpl();
                taglinesImpl2.f81920c = alvx.mo40823d();
                PersonImpl.MetadataImpl metadataImpl32 = new PersonImpl.MetadataImpl();
                metadataImpl32.f81825b = "profile";
                metadataImpl32.mo46318a(true);
                metadataImpl32.mo46320c(false);
                taglinesImpl2.f81919b = metadataImpl32;
                smartProfilePerson2.mo46294a(taglinesImpl2);
                PersonImpl.ImagesImpl imagesImpl22 = new PersonImpl.ImagesImpl();
                ImageReferenceImpl imageReferenceImpl22 = new ImageReferenceImpl();
                imageReferenceImpl22.f81723c = alvx.mo40825f();
                imageReferenceImpl22.mo46271a(1);
                imagesImpl22.f81808c = imageReferenceImpl22;
                imagesImpl22.mo46311a(true);
                PersonImpl.MetadataImpl metadataImpl42 = new PersonImpl.MetadataImpl();
                metadataImpl42.f81825b = "profile";
                metadataImpl42.mo46318a(true);
                metadataImpl42.mo46320c(false);
                imagesImpl22.f81807b = metadataImpl42;
                smartProfilePerson2.mo46282a(imagesImpl22);
                if (alvx.mo40827h() != null) {
                }
                if (alvx.mo40828i() != null) {
                }
                if (alvx.mo40829j() != null) {
                }
            }
            if (alvq != null) {
            }
            smartProfilePerson = smartProfilePerson2;
            if (alvq != null) {
            }
            return smartProfilePerson;
        }
        alvx = null;
        alxh alxh22 = this.f74492b;
        Context context2 = alxh22.f74506m;
        Object obj2 = alxh22.f74504b[i3];
        SmartProfilePerson smartProfilePerson22 = new SmartProfilePerson();
        try {
            i2 = alwb.f74440b;
            if (i2 != 2) {
            }
            if (alvq != null) {
            }
            smartProfilePerson = smartProfilePerson22;
        } catch (siy e3) {
            Log.w("DefaultPersonFactory", "ParseException", e3);
            smartProfilePerson = null;
        }
        if (alvq != null) {
        }
        return smartProfilePerson;
    }
}
