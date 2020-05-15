package p000;

import com.google.android.gms.people.identity.internal.models.ImageReferenceImpl;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.List;

/* renamed from: alxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alxx {
    /* renamed from: a */
    private static PersonImpl.AboutsImpl m62098a(Person.Abouts abouts) {
        PersonImpl.AboutsImpl aboutsImpl = new PersonImpl.AboutsImpl();
        if (abouts.f83179a.contains(2)) {
            aboutsImpl.f81761b = m62100a(abouts.f83180b);
        }
        if (abouts.f83179a.contains(3)) {
            aboutsImpl.f81762c = abouts.f83181c;
        }
        if (abouts.f83179a.contains(4)) {
            aboutsImpl.f81763d = abouts.f83182d;
        }
        return aboutsImpl;
    }

    /* renamed from: a */
    private static PersonImpl.AddressesImpl m62099a(Person.Addresses addresses) {
        PersonImpl.AddressesImpl addressesImpl = new PersonImpl.AddressesImpl();
        if (addresses.f83184a.contains(7)) {
            addressesImpl.f81765b = m62100a(addresses.f83188e);
        }
        if (addresses.f83184a.contains(2)) {
            addressesImpl.f81766c = addresses.f83185b;
        }
        if (addresses.f83184a.contains(3)) {
            addressesImpl.f81767d = addresses.f83186c;
        }
        if (addresses.f83184a.contains(8)) {
            addressesImpl.f81770g = addresses.f83189f;
        }
        if (addresses.f83184a.contains(9)) {
            addressesImpl.f81771h = addresses.f83190g;
        }
        if (addresses.f83184a.contains(10)) {
            addressesImpl.f81772i = addresses.f83191h;
        }
        if (addresses.f83184a.contains(11)) {
            addressesImpl.f81773j = addresses.f83192i;
        }
        if (addresses.f83184a.contains(12)) {
            addressesImpl.f81774k = addresses.f83193j;
        }
        if (addresses.f83184a.contains(13)) {
            addressesImpl.f81775l = addresses.f83194k;
        }
        return addressesImpl;
    }

    /* renamed from: a */
    private static PersonImpl.MetadataImpl m62100a(Mergedpeoplemetadata mergedpeoplemetadata) {
        PersonImpl.MetadataImpl metadataImpl = new PersonImpl.MetadataImpl();
        metadataImpl.f81825b = mergedpeoplemetadata.f83118c;
        metadataImpl.f81826c = mergedpeoplemetadata.f83119d;
        metadataImpl.f81827d = mergedpeoplemetadata.f83120e;
        metadataImpl.mo46318a(mergedpeoplemetadata.f83125j);
        return metadataImpl;
    }

    /* renamed from: a */
    public static void m62101a(Person person, PersonImpl personImpl) {
        Person person2 = person;
        PersonImpl personImpl2 = personImpl;
        if (person2.f83152a.contains(2)) {
            List list = person2.f83153b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                personImpl2.mo46273a(m62098a((Person.Abouts) list.get(i)));
            }
        }
        if (person2.f83152a.contains(3)) {
            List list2 = person2.f83154c;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                personImpl2.mo46274a(m62099a((Person.Addresses) list2.get(i2)));
            }
        }
        if (person2.f83152a.contains(5)) {
            List list3 = person2.f83155d;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Person.Birthdays birthdays = (Person.Birthdays) list3.get(i3);
                PersonImpl.BirthdaysImpl birthdaysImpl = new PersonImpl.BirthdaysImpl();
                if (birthdays.f83196a.contains(3)) {
                    birthdaysImpl.f81777b = m62100a(birthdays.f83198c);
                }
                if (birthdays.f83196a.contains(2)) {
                    birthdaysImpl.f81778c = birthdays.f83197b;
                }
                personImpl2.mo46275a(birthdaysImpl);
            }
        }
        if (person2.f83152a.contains(6)) {
            List list4 = person2.f83156e;
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                Person.BraggingRights braggingRights = (Person.BraggingRights) list4.get(i4);
                PersonImpl.BraggingRightsImpl braggingRightsImpl = new PersonImpl.BraggingRightsImpl();
                if (braggingRights.f83200a.contains(2)) {
                    braggingRightsImpl.f81780b = m62100a(braggingRights.f83201b);
                }
                if (braggingRights.f83200a.contains(3)) {
                    braggingRightsImpl.f81781c = braggingRights.f83202c;
                }
                personImpl2.mo46276a(braggingRightsImpl);
            }
        }
        if (person2.f83152a.contains(9)) {
            List list5 = person2.f83159h;
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                Person.CoverPhotos coverPhotos = (Person.CoverPhotos) list5.get(i5);
                PersonImpl.CoverPhotosImpl coverPhotosImpl = new PersonImpl.CoverPhotosImpl();
                if (coverPhotos.f83216a.contains(2)) {
                    coverPhotosImpl.mo46302a(coverPhotos.f83217b);
                }
                if (coverPhotos.f83216a.contains(3)) {
                    coverPhotosImpl.f81784c = coverPhotos.f83218c;
                }
                if (coverPhotos.f83216a.contains(7)) {
                    ImageReferenceImpl imageReferenceImpl = new ImageReferenceImpl();
                    imageReferenceImpl.f81723c = coverPhotos.f83221f;
                    imageReferenceImpl.mo46271a(1);
                    coverPhotosImpl.f81785d = imageReferenceImpl;
                }
                if (coverPhotos.f83216a.contains(8)) {
                    coverPhotosImpl.mo46304b(coverPhotos.f83222g);
                }
                if (coverPhotos.f83216a.contains(5)) {
                    coverPhotosImpl.mo46303a(coverPhotos.f83219d);
                }
                personImpl2.mo46277a(coverPhotosImpl);
            }
        }
        if (person2.f83152a.contains(10)) {
            List list6 = person2.f83160i;
            int size6 = list6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                Person.CustomFields customFields = (Person.CustomFields) list6.get(i6);
                PersonImpl.CustomFieldsImpl customFieldsImpl = new PersonImpl.CustomFieldsImpl();
                if (customFields.f83224a.contains(2)) {
                    customFieldsImpl.f81789b = customFields.f83225b;
                }
                if (customFields.f83224a.contains(4)) {
                    customFieldsImpl.f81790c = customFields.f83227d;
                }
                personImpl2.mo46278a(customFieldsImpl);
            }
        }
        if (person2.f83152a.contains(11)) {
            List list7 = person2.f83161j;
            int size7 = list7.size();
            for (int i7 = 0; i7 < size7; i7++) {
                Person.Emails emails = (Person.Emails) list7.get(i7);
                PersonImpl.EmailsImpl emailsImpl = new PersonImpl.EmailsImpl();
                if (emails.f83229a.contains(5)) {
                    emailsImpl.f81792b = m62100a(emails.f83232d);
                }
                if (emails.f83229a.contains(4)) {
                    emailsImpl.f81793c = emails.f83231c;
                }
                if (emails.f83229a.contains(6)) {
                    emailsImpl.f81794d = emails.f83233e;
                }
                if (emails.f83229a.contains(7)) {
                    emailsImpl.f81795e = emails.f83234f;
                }
                personImpl2.mo46279a(emailsImpl);
            }
        }
        if (person2.f83152a.contains(12)) {
            personImpl2.f81743j = person2.f83162k;
        }
        if (person2.f83152a.contains(13)) {
            List list8 = person2.f83163l;
            int size8 = list8.size();
            for (int i8 = 0; i8 < size8; i8++) {
                Person.Events events = (Person.Events) list8.get(i8);
                PersonImpl.EventsImpl eventsImpl = new PersonImpl.EventsImpl();
                if (events.f83245a.contains(4)) {
                    eventsImpl.f81798b = m62100a(events.f83248d);
                }
                if (events.f83245a.contains(3)) {
                    eventsImpl.f81799c = events.f83247c;
                }
                if (events.f83245a.contains(5)) {
                    eventsImpl.f81800d = events.f83249e;
                }
                if (events.f83245a.contains(2)) {
                    eventsImpl.f81801e = events.f83246b;
                }
                personImpl2.mo46280a(eventsImpl);
            }
        }
        if (person2.f83152a.contains(17)) {
            List list9 = person2.f83166o;
            int size9 = list9.size();
            for (int i9 = 0; i9 < size9; i9++) {
                Person.Genders genders = (Person.Genders) list9.get(i9);
                PersonImpl.GendersImpl gendersImpl = new PersonImpl.GendersImpl();
                if (genders.f83268a.contains(4)) {
                    gendersImpl.f81803b = m62100a(genders.f83270c);
                }
                if (genders.f83268a.contains(3)) {
                    gendersImpl.f81804c = genders.f83269b;
                }
                if (genders.f83268a.contains(5)) {
                    gendersImpl.f81805d = genders.f83271d;
                }
                personImpl2.mo46281a(gendersImpl);
            }
        }
        if (person2.f83152a.contains(18)) {
            personImpl2.f81746m = person2.f83167p;
        }
        if (person2.f83152a.contains(19)) {
            List list10 = person2.f83168q;
            int size10 = list10.size();
            for (int i10 = 0; i10 < size10; i10++) {
                Person.Images images = (Person.Images) list10.get(i10);
                PersonImpl.ImagesImpl imagesImpl = new PersonImpl.ImagesImpl();
                if (images.f83273a.contains(3)) {
                    imagesImpl.f81807b = m62100a(images.f83275c);
                }
                if (images.mo46740b()) {
                    ImageReferenceImpl imageReferenceImpl2 = new ImageReferenceImpl();
                    imageReferenceImpl2.f81723c = images.f83277e;
                    imageReferenceImpl2.mo46271a(1);
                    imagesImpl.f81808c = imageReferenceImpl2;
                }
                if (images.f83273a.contains(2)) {
                    imagesImpl.mo46311a(images.f83274b);
                }
                personImpl2.mo46282a(imagesImpl);
            }
        }
        if (person2.f83152a.contains(21)) {
            List list11 = person2.f83169r;
            int size11 = list11.size();
            for (int i11 = 0; i11 < size11; i11++) {
                Person.InstantMessaging instantMessaging = (Person.InstantMessaging) list11.get(i11);
                PersonImpl.InstantMessagingImpl instantMessagingImpl = new PersonImpl.InstantMessagingImpl();
                if (instantMessaging.f83279a.contains(4)) {
                    instantMessagingImpl.f81811b = m62100a(instantMessaging.f83282d);
                }
                if (instantMessaging.f83279a.contains(2)) {
                    instantMessagingImpl.f81812c = instantMessaging.f83280b;
                }
                if (instantMessaging.f83279a.contains(3)) {
                    instantMessagingImpl.f81813d = instantMessaging.f83281c;
                }
                if (instantMessaging.f83279a.contains(5)) {
                    instantMessagingImpl.f81814e = instantMessaging.f83283e;
                }
                if (instantMessaging.f83279a.contains(6)) {
                    instantMessagingImpl.f81815f = instantMessaging.f83284f;
                }
                if (instantMessaging.f83279a.contains(7)) {
                    instantMessagingImpl.f81816g = instantMessaging.f83285g;
                }
                personImpl2.mo46283a(instantMessagingImpl);
            }
        }
        if (person2.f83152a.contains(24)) {
            personImpl2.f81749p = person2.f83171t;
        }
        if (person2.f83152a.contains(26)) {
            Person.LegacyFields legacyFields = person2.f83173v;
            PersonImpl.LegacyFieldsImpl legacyFieldsImpl = new PersonImpl.LegacyFieldsImpl();
            if (legacyFields.f83295a.contains(2)) {
                legacyFieldsImpl.f81818b = legacyFields.f83296b;
            }
            personImpl2.f81750q = legacyFieldsImpl;
        }
        if (person2.f83152a.contains(28)) {
            List list12 = person2.f83174w;
            int size12 = list12.size();
            for (int i12 = 0; i12 < size12; i12++) {
                Person.Memberships memberships = (Person.Memberships) list12.get(i12);
                PersonImpl.MembershipsImpl membershipsImpl = new PersonImpl.MembershipsImpl();
                if (memberships.f83298a.contains(4)) {
                    membershipsImpl.f81820b = m62100a(memberships.f83301d);
                }
                if (memberships.f83298a.contains(2)) {
                    membershipsImpl.f81821c = memberships.f83299b;
                }
                if (memberships.f83298a.contains(3)) {
                    membershipsImpl.f81822d = memberships.f83300c;
                }
                if (memberships.f83298a.contains(5)) {
                    membershipsImpl.f81823e = memberships.f83302e;
                }
                personImpl2.mo46284a(membershipsImpl);
            }
        }
        if (person2.f83152a.contains(29)) {
            Person.Metadata metadata = person2.f83175x;
            PersonImpl.PersonMetadataImpl personMetadataImpl = new PersonImpl.PersonMetadataImpl();
            if (metadata.f83304a.contains(3)) {
                personMetadataImpl.mo46329a(metadata.f83306c);
            }
            if (metadata.f83304a.contains(4)) {
                personMetadataImpl.mo46331b(metadata.f83307d);
            }
            if (metadata.f83304a.contains(6)) {
                personMetadataImpl.mo46333c(metadata.f83309f);
            }
            if (metadata.f83304a.contains(7)) {
                personMetadataImpl.mo46335d(metadata.f83310g);
            }
            if (metadata.f83304a.contains(10)) {
                personMetadataImpl.mo46336e(metadata.f83313j);
            }
            if (metadata.f83304a.contains(13)) {
                personMetadataImpl.mo46337f(metadata.f83316m);
            }
            if (metadata.f83304a.contains(15)) {
                personMetadataImpl.f81878h = metadata.f83318o;
            }
            if (metadata.f83304a.contains(16)) {
                personMetadataImpl.f81879i = metadata.f83319p;
            }
            if (metadata.mo46747b()) {
                personMetadataImpl.mo46338g(metadata.f83320q);
            }
            if (metadata.f83304a.contains(18)) {
                personMetadataImpl.f81881k = metadata.f83321r;
            }
            if (metadata.f83304a.contains(19)) {
                Person.Metadata.ProfileOwnerStats profileOwnerStats = metadata.f83322s;
                PersonImpl.ProfileOwnerStatsImpl profileOwnerStatsImpl = new PersonImpl.ProfileOwnerStatsImpl();
                if (profileOwnerStats.f83336a.contains(2)) {
                    profileOwnerStatsImpl.mo46344a(profileOwnerStats.f83337b);
                }
                if (profileOwnerStats.f83336a.contains(3)) {
                    profileOwnerStatsImpl.mo46345b(profileOwnerStats.f83338c);
                }
                personMetadataImpl.f81882l = profileOwnerStatsImpl;
            }
            if (metadata.f83304a.contains(5)) {
                personMetadataImpl.mo46330a(metadata.f83308e);
            }
            if (metadata.f83304a.contains(9)) {
                personMetadataImpl.mo46332b(metadata.f83312i);
            }
            if (metadata.f83304a.contains(12)) {
                personMetadataImpl.mo46334c(metadata.f83315l);
            }
            personImpl2.f81753t = personMetadataImpl;
        }
        if (person2.f83152a.contains(30)) {
            List list13 = person2.f83176y;
            int size13 = list13.size();
            for (int i13 = 0; i13 < size13; i13++) {
                Person.Names names = (Person.Names) list13.get(i13);
                PersonImpl.NamesImpl namesImpl = new PersonImpl.NamesImpl();
                if (names.f83340a.contains(8)) {
                    namesImpl.f81835b = m62100a(names.f83347h);
                }
                if (names.f83340a.contains(2)) {
                    namesImpl.f81836c = names.f83341b;
                }
                if (names.f83340a.contains(3)) {
                    namesImpl.f81837d = names.f83342c;
                }
                if (names.f83340a.contains(4)) {
                    namesImpl.f81838e = names.f83343d;
                }
                if (names.f83340a.contains(5)) {
                    namesImpl.f81839f = names.f83344e;
                }
                if (names.f83340a.contains(6)) {
                    namesImpl.f81840g = names.f83345f;
                }
                if (names.f83340a.contains(7)) {
                    namesImpl.f81841h = names.f83346g;
                }
                if (names.f83340a.contains(9)) {
                    namesImpl.f81842i = names.f83348i;
                }
                if (names.f83340a.contains(10)) {
                    namesImpl.f81843j = names.f83349j;
                }
                if (names.f83340a.contains(11)) {
                    namesImpl.f81844k = names.f83350k;
                }
                if (names.f83340a.contains(12)) {
                    namesImpl.f81845l = names.f83351l;
                }
                if (names.f83340a.contains(13)) {
                    namesImpl.f81846m = names.f83352m;
                }
                personImpl2.mo46285a(namesImpl);
            }
        }
        if (person2.f83152a.contains(31)) {
            List list14 = person2.f83177z;
            int size14 = list14.size();
            for (int i14 = 0; i14 < size14; i14++) {
                Person.Nicknames nicknames = (Person.Nicknames) list14.get(i14);
                PersonImpl.NicknamesImpl nicknamesImpl = new PersonImpl.NicknamesImpl();
                if (nicknames.f83355a.contains(2)) {
                    nicknamesImpl.f81848b = m62100a(nicknames.f83356b);
                }
                if (nicknames.f83355a.contains(3)) {
                    nicknamesImpl.f81849c = nicknames.f83357c;
                }
                if (nicknames.f83355a.contains(4)) {
                    nicknamesImpl.f81850d = nicknames.f83358d;
                }
                personImpl2.mo46286a(nicknamesImpl);
            }
        }
        if (person2.f83152a.contains(32)) {
            List list15 = person2.f83140A;
            int size15 = list15.size();
            for (int i15 = 0; i15 < size15; i15++) {
                Person.Occupations occupations = (Person.Occupations) list15.get(i15);
                PersonImpl.OccupationsImpl occupationsImpl = new PersonImpl.OccupationsImpl();
                if (occupations.f83360a.contains(2)) {
                    occupationsImpl.f81855b = m62100a(occupations.f83361b);
                }
                if (occupations.f83360a.contains(3)) {
                    occupationsImpl.f81856c = occupations.f83362c;
                }
                personImpl2.mo46288a(occupationsImpl);
            }
        }
        if (person2.f83152a.contains(33)) {
            List list16 = person2.f83141B;
            int size16 = list16.size();
            for (int i16 = 0; i16 < size16; i16++) {
                Person.Organizations organizations = (Person.Organizations) list16.get(i16);
                PersonImpl.OrganizationsImpl organizationsImpl = new PersonImpl.OrganizationsImpl();
                if (organizations.f83364a.contains(9)) {
                    organizationsImpl.f81858b = m62100a(organizations.f83371h);
                }
                if (organizations.f83364a.contains(2)) {
                    organizationsImpl.mo46326a(organizations.f83365b);
                }
                if (organizations.f83364a.contains(3)) {
                    organizationsImpl.f81860d = organizations.f83366c;
                }
                if (organizations.f83364a.contains(4)) {
                    organizationsImpl.f81861e = organizations.f83367d;
                }
                if (organizations.f83364a.contains(5)) {
                    organizationsImpl.f81862f = organizations.f83368e;
                }
                if (organizations.f83364a.contains(6)) {
                    organizationsImpl.f81863g = organizations.f83369f;
                }
                if (organizations.f83364a.contains(8)) {
                    organizationsImpl.f81864h = organizations.f83370g;
                }
                if (organizations.f83364a.contains(10)) {
                    organizationsImpl.f81865i = organizations.f83372i;
                }
                if (organizations.f83364a.contains(11)) {
                    organizationsImpl.f81866j = organizations.f83373j;
                }
                if (organizations.f83364a.contains(12)) {
                    organizationsImpl.f81867k = organizations.f83374k;
                }
                if (organizations.f83364a.contains(14)) {
                    organizationsImpl.f81868l = organizations.f83375l;
                }
                if (organizations.f83364a.contains(15)) {
                    organizationsImpl.f81869m = organizations.f83376m;
                }
                if (organizations.f83364a.contains(16)) {
                    organizationsImpl.f81870n = organizations.f83377n;
                }
                personImpl2.mo46289a(organizationsImpl);
            }
        }
        if (person2.f83152a.contains(36)) {
            List list17 = person2.f83143D;
            int size17 = list17.size();
            for (int i17 = 0; i17 < size17; i17++) {
                Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list17.get(i17);
                PersonImpl.PhoneNumbersImpl phoneNumbersImpl = new PersonImpl.PhoneNumbersImpl();
                if (phoneNumbers.f83384a.contains(5)) {
                    phoneNumbersImpl.f81887b = m62100a(phoneNumbers.f83387d);
                }
                if (phoneNumbers.f83384a.contains(2)) {
                    phoneNumbersImpl.f81888c = phoneNumbers.f83385b;
                }
                if (phoneNumbers.f83384a.contains(4)) {
                    phoneNumbersImpl.f81889d = phoneNumbers.f83386c;
                }
                if (phoneNumbers.f83384a.contains(6)) {
                    phoneNumbersImpl.f81890e = phoneNumbers.f83388e;
                }
                if (phoneNumbers.f83384a.contains(8)) {
                    phoneNumbersImpl.f81891f = phoneNumbers.f83389f;
                }
                personImpl2.mo46290a(phoneNumbersImpl);
            }
        }
        if (person2.f83152a.contains(38)) {
            List list18 = person2.f83144E;
            int size18 = list18.size();
            for (int i18 = 0; i18 < size18; i18++) {
                Person.PlacesLived placesLived = (Person.PlacesLived) list18.get(i18);
                PersonImpl.PlacesLivedImpl placesLivedImpl = new PersonImpl.PlacesLivedImpl();
                if (placesLived.f83391a.contains(3)) {
                    placesLivedImpl.f81894b = m62100a(placesLived.f83393c);
                }
                if (placesLived.f83391a.contains(2)) {
                    placesLivedImpl.mo46342a(placesLived.f83392b);
                }
                if (placesLived.f83391a.contains(4)) {
                    placesLivedImpl.f81896d = placesLived.f83394d;
                }
                personImpl2.mo46291a(placesLivedImpl);
            }
        }
        if (person2.f83152a.contains(39)) {
            personImpl2.f81725A = person2.f83145F;
        }
        if (person2.f83152a.contains(40)) {
            List list19 = person2.f83146G;
            int size19 = list19.size();
            for (int i19 = 0; i19 < size19; i19++) {
                Person.Relations relations = (Person.Relations) list19.get(i19);
                PersonImpl.RelationsImpl relationsImpl = new PersonImpl.RelationsImpl();
                if (relations.f83396a.contains(3)) {
                    relationsImpl.f81901b = m62100a(relations.f83398c);
                }
                if (relations.f83396a.contains(2)) {
                    relationsImpl.f81902c = relations.f83397b;
                }
                if (relations.f83396a.contains(4)) {
                    relationsImpl.f81903d = relations.f83399d;
                }
                if (relations.f83396a.contains(5)) {
                    relationsImpl.f81904e = relations.f83400e;
                }
                personImpl2.mo46292a(relationsImpl);
            }
        }
        if (person2.f83152a.contains(44)) {
            List list20 = person2.f83148I;
            int size20 = list20.size();
            for (int i20 = 0; i20 < size20; i20++) {
                Person.Skills skills = (Person.Skills) list20.get(i20);
                PersonImpl.SkillsImpl skillsImpl = new PersonImpl.SkillsImpl();
                if (skills.f83407a.contains(2)) {
                    skillsImpl.f81913b = m62100a(skills.f83408b);
                }
                if (skills.f83407a.contains(3)) {
                    skillsImpl.f81914c = skills.f83409c;
                }
                personImpl2.mo46293a(skillsImpl);
            }
        }
        if (person2.f83152a.contains(45)) {
            Person.SortKeys sortKeys = person2.f83149J;
            PersonImpl.SortKeysImpl sortKeysImpl = new PersonImpl.SortKeysImpl();
            if (sortKeys.f83411a.contains(4)) {
                sortKeysImpl.f81916b = sortKeys.f83414d;
            }
            if (sortKeys.f83411a.contains(6)) {
                sortKeysImpl.f81917c = sortKeys.f83416f;
            }
            personImpl2.f81730F = sortKeysImpl;
        }
        if (person2.f83152a.contains(46)) {
            List list21 = person2.f83150K;
            int size21 = list21.size();
            for (int i21 = 0; i21 < size21; i21++) {
                Person.Taglines taglines = (Person.Taglines) list21.get(i21);
                PersonImpl.TaglinesImpl taglinesImpl = new PersonImpl.TaglinesImpl();
                if (taglines.f83418a.contains(2)) {
                    taglinesImpl.f81919b = m62100a(taglines.f83419b);
                }
                if (taglines.f83418a.contains(3)) {
                    taglinesImpl.f81920c = taglines.f83420c;
                }
                personImpl2.mo46294a(taglinesImpl);
            }
        }
        if (person2.f83152a.contains(47)) {
            List list22 = person2.f83151L;
            int size22 = list22.size();
            for (int i22 = 0; i22 < size22; i22++) {
                Person.Urls urls = (Person.Urls) list22.get(i22);
                PersonImpl.UrlsImpl urlsImpl = new PersonImpl.UrlsImpl();
                if (urls.f83422a.contains(3)) {
                    urlsImpl.f81922b = m62100a(urls.f83424c);
                }
                if (urls.f83422a.contains(2)) {
                    urlsImpl.f81923c = urls.f83423b;
                }
                if (urls.f83422a.contains(5)) {
                    urlsImpl.f81924d = urls.f83425d;
                }
                if (urls.f83422a.contains(6)) {
                    urlsImpl.f81925e = urls.f83426e;
                }
                personImpl2.mo46295a(urlsImpl);
            }
        }
    }
}
